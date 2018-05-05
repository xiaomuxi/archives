package com.project.archives.function.main.ageListFragments;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ListView;

import com.project.archives.R;
import com.project.archives.common.base.fragment.BaseLoadingFragment;
import com.project.archives.common.bean.MessageEvent;
import com.project.archives.common.dao.Verifications;
import com.project.archives.common.utils.UIUtils;
import com.project.archives.function.main.adapter.VerificationsListAdapter;
import com.project.archives.common.dao.manager.VerificationsManager;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by inrokei on 2018/5/1.
 */

public class AgeVerificationsFragment extends BaseLoadingFragment{
    private ListView listView;
    private List<Verifications> list = new ArrayList<>();
    private VerificationsListAdapter adapter;

    @Override
    protected View setContentView() {
        return UIUtils.inflate(mContext, R.layout.fragment_list_verifications);
    }

    @Override
    protected void init() {

    }

    @Override
    protected void initView(View view) {
        listView = (ListView) view.findViewById(R.id.list_view);
    }

    @Override
    protected void initCreated(Bundle savedInstanceState) {
        adapter = new VerificationsListAdapter(mContext);
        listView.setAdapter(adapter);

        initData();
    }

    private void initData() {

        list = VerificationsManager.getInstance().getVerificationList(null, null, null, null);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                show(check(list));
                adapter.setData(list);
                MessageEvent messageEvent = new MessageEvent<Integer>("AGE_VERIFICATIONS", list.size());
                EventBus.getDefault().post(messageEvent);
            }
        }, 500);
    }

    public void getDataByAge(String startAge, String endAge) {
        list = VerificationsManager.getInstance().getVerificationsListByAge(startAge, endAge);
        adapter.setData(list);

        MessageEvent messageEvent = new MessageEvent<Integer>("AGE_VERIFICATIONS", list.size());
        EventBus.getDefault().post(messageEvent);
    }

    @Override
    protected View createLoadedView() {
        return setContentView();
    }

    @Override
    protected void load() {

    }
}
