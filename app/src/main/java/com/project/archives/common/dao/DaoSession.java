package com.project.archives.common.dao;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import java.util.Map;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig caseInvesDaoConfig;
    private final DaoConfig verificationsDaoConfig;
    private final DaoConfig lettersDaoConfig;
    private final DaoConfig endingsDaoConfig;
    private final DaoConfig zancunsDaoConfig;
    private final DaoConfig multiDictionariesDaoConfig;
    private final DaoConfig usersDaoConfig;
    private final DaoConfig dutyReportsDaoConfig;

    private final CaseInvesDao caseInvesDao;
    private final VerificationsDao verificationsDao;
    private final LettersDao lettersDao;
    private final EndingsDao endingsDao;
    private final ZancunsDao zancunsDao;
    private final MultiDictionariesDao multiDictionariesDao;
    private final UsersDao usersDao;

    private final DaoConfig giftsDaoConfig;
    private final DaoConfig giftHandDetailsDaoConfig;
    private final DaoConfig giftCardsDaoConfig;
    private final DaoConfig giftHandsDaoConfig;

    private final GiftsDao giftsDao;
    private final GiftHandDetailsDao giftHandDetailsDao;
    private final GiftCardsDao giftCardsDao;
    private final GiftHandsDao giftHandsDao;
    private final DutyReportsDao dutyReportsDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        caseInvesDaoConfig = daoConfigMap.get(CaseInvesDao.class).clone();
        caseInvesDaoConfig.initIdentityScope(type);
        usersDaoConfig = daoConfigMap.get(UsersDao.class).clone();
        usersDaoConfig.initIdentityScope(type);
        usersDao = new UsersDao(usersDaoConfig, this);
        dutyReportsDaoConfig = daoConfigMap.get(DutyReportsDao.class).clone();
        dutyReportsDaoConfig.initIdentityScope(type);
        dutyReportsDao = new DutyReportsDao(dutyReportsDaoConfig, this);

        verificationsDaoConfig = daoConfigMap.get(VerificationsDao.class).clone();
        verificationsDaoConfig.initIdentityScope(type);

        lettersDaoConfig = daoConfigMap.get(LettersDao.class).clone();
        lettersDaoConfig.initIdentityScope(type);

        endingsDaoConfig = daoConfigMap.get(EndingsDao.class).clone();
        endingsDaoConfig.initIdentityScope(type);

        zancunsDaoConfig = daoConfigMap.get(ZancunsDao.class).clone();
        zancunsDaoConfig.initIdentityScope(type);

        multiDictionariesDaoConfig = daoConfigMap.get(MultiDictionariesDao.class).clone();
        multiDictionariesDaoConfig.initIdentityScope(type);

        caseInvesDao = new CaseInvesDao(caseInvesDaoConfig, this);
        verificationsDao = new VerificationsDao(verificationsDaoConfig, this);
        lettersDao = new LettersDao(lettersDaoConfig, this);
        endingsDao = new EndingsDao(endingsDaoConfig, this);
        zancunsDao = new ZancunsDao(zancunsDaoConfig, this);
        multiDictionariesDao = new MultiDictionariesDao(multiDictionariesDaoConfig, this);

        giftsDaoConfig = daoConfigMap.get(GiftsDao.class).clone();
        giftsDaoConfig.initIdentityScope(type);

        giftHandDetailsDaoConfig = daoConfigMap.get(GiftHandDetailsDao.class).clone();
        giftHandDetailsDaoConfig.initIdentityScope(type);

        giftCardsDaoConfig = daoConfigMap.get(GiftCardsDao.class).clone();
        giftCardsDaoConfig.initIdentityScope(type);

        giftHandsDaoConfig = daoConfigMap.get(GiftHandsDao.class).clone();
        giftHandsDaoConfig.initIdentityScope(type);

        giftsDao = new GiftsDao(giftsDaoConfig, this);
        giftHandDetailsDao = new GiftHandDetailsDao(giftHandDetailsDaoConfig, this);
        giftCardsDao = new GiftCardsDao(giftCardsDaoConfig, this);
        giftHandsDao = new GiftHandsDao(giftHandsDaoConfig, this);

        registerDao(Gifts.class, giftsDao);
        registerDao(GiftHandDetails.class, giftHandDetailsDao);
        registerDao(GiftCards.class, giftCardsDao);
        registerDao(GiftHands.class, giftHandsDao);
        registerDao(CaseInves.class, caseInvesDao);
        registerDao(Verifications.class, verificationsDao);
        registerDao(Letters.class, lettersDao);
        registerDao(Endings.class, endingsDao);
        registerDao(Zancuns.class, zancunsDao);
        registerDao(MultiDictionaries.class, multiDictionariesDao);
        registerDao(Users.class, usersDao);
        registerDao(DutyReports.class, dutyReportsDao);
    }
    
    public void clear() {
        caseInvesDaoConfig.clearIdentityScope();
        verificationsDaoConfig.clearIdentityScope();
        lettersDaoConfig.clearIdentityScope();
        endingsDaoConfig.clearIdentityScope();
        zancunsDaoConfig.clearIdentityScope();
        multiDictionariesDaoConfig.clearIdentityScope();
        usersDaoConfig.clearIdentityScope();
        giftsDaoConfig.clearIdentityScope();
        giftHandDetailsDaoConfig.clearIdentityScope();
        giftCardsDaoConfig.clearIdentityScope();
        giftHandsDaoConfig.clearIdentityScope();
        dutyReportsDaoConfig.clearIdentityScope();
    }

    public CaseInvesDao getCaseInvesDao() {
        return caseInvesDao;
    }

    public VerificationsDao getVerificationsDao() {
        return verificationsDao;
    }

    public LettersDao getLettersDao() {
        return lettersDao;
    }

    public EndingsDao getEndingsDao() {
        return endingsDao;
    }

    public ZancunsDao getZancunsDao() {
        return zancunsDao;
    }

    public MultiDictionariesDao getMultiDictionariesDao() {
        return multiDictionariesDao;
    }

    public UsersDao getUsersDao() {
        return usersDao;
    }

    public GiftsDao getGiftsDao() {
        return giftsDao;
    }

    public GiftHandDetailsDao getGiftHandDetailsDao() {
        return giftHandDetailsDao;
    }

    public GiftCardsDao getGiftCardsDao() {
        return giftCardsDao;
    }

    public GiftHandsDao getGiftHandsDao() {
        return giftHandsDao;
    }

    public DutyReportsDao getDutyReportsDao() {
        return dutyReportsDao;
    }

}
