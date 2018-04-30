package com.project.archives.function.main.manager;

import com.project.archives.common.dao.Endings;
import com.project.archives.common.dao.EndingsDao;
import com.project.archives.common.dao.GreenDaoHelper;
import com.project.archives.common.utils.LogUtils;
import com.project.archives.common.utils.StringUtils;

import org.greenrobot.greendao.query.QueryBuilder;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by inrokei on 2018/4/30.
 */

public class EndingsManager {
    private static EndingsManager mInstance;
    private EndingsDao endingsDao;

    private EndingsManager() {
        endingsDao = GreenDaoHelper.getInstance().getDaoSession().getEndingsDao();
    }

    public static EndingsManager getInstance() {
        if (mInstance == null) {
            mInstance = new EndingsManager();
        }

        return mInstance;
    }

    public long getCount() {
        return endingsDao.count();
    }

    public List<Endings> getEndingList(String userName, String companyName, String startTime, String endTime) {
        Date start = null;
        Date end = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);
        try {
            if (!StringUtils.isEmpty(startTime)) {
                start = format.parse(startTime);
            }
            if (!StringUtils.isEmpty(endTime)) {
                end = format.parse(startTime);
            }
        }
        catch (Exception e) {
            LogUtils.e(CaseInvesManager.class.getName(), e);
        }

        QueryBuilder<Endings> queryBuilder = endingsDao.queryBuilder();
        if (!StringUtils.isEmpty(userName)) {
            queryBuilder.where(EndingsDao.Properties.Name.eq(userName));
        }

        if (!StringUtils.isEmpty(companyName)) {
            queryBuilder.where(EndingsDao.Properties.Init.like("%" + companyName + "%"));
        }

        if (!StringUtils.isEmpty(startTime) && !StringUtils.isEmpty(endTime)) {
            queryBuilder.where(EndingsDao.Properties.AddDate.between(start, end));
        }
        else if(!StringUtils.isEmpty(startTime)) {
            queryBuilder.where(EndingsDao.Properties.AddDate.ge(start));
        }
        else if(!StringUtils.isEmpty(endTime)) {
            queryBuilder.where(EndingsDao.Properties.AddDate.le(end));
        }

        queryBuilder.orderDesc(EndingsDao.Properties.UpdateDate);

        return queryBuilder.list();
    }
}