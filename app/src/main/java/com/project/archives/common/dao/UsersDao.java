package com.project.archives.common.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "USERS".
*/
public class UsersDao extends AbstractDao<Users, byte[]> {

    public static final String TABLENAME = "Users";

    /**
     * Properties of entity Users.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property ID = new Property(0, byte[].class, "ID", true, "ID");
        public final static Property IsDelete = new Property(1, Integer.class, "IsDelete", false, "IsDelete");
        public final static Property RealName = new Property(2, String.class, "RealName", false, "RealName");
        public final static Property IDCard = new Property(3, String.class, "IDCard", false, "IDCard");
        public final static Property Sex = new Property(4, Integer.class, "Sex", false, "Sex");
        public final static Property Age = new Property(5, Integer.class, "Age", false, "Age");
        public final static Property National = new Property(6, String.class, "National", false, "National");
        public final static Property NativePlace = new Property(7, String.class, "NativePlace", false, "NativePlace");
        public final static Property HomePlace = new Property(8, String.class, "HomePlace", false, "HomePlace");
        public final static Property Health = new Property(9, String.class, "Health", false, "Health");
        public final static Property ZPosition = new Property(10, String.class, "ZPosition", false, "ZPosition");
        public final static Property Specialty = new Property(11, String.class, "Specialty", false, "Specialty");
        public final static Property QEducation = new Property(12, String.class, "QEducation", false, "QEducation");
        public final static Property QSchool = new Property(13, String.class, "QSchool", false, "QSchool");
        public final static Property Education = new Property(14, String.class, "Education", false, "Education");
        public final static Property School = new Property(15, String.class, "School", false, "School");
        public final static Property Resume = new Property(16, String.class, "Resume", false, "Resume");
        public final static Property BonusPenalty = new Property(17, String.class, "BonusPenalty", false, "BonusPenalty");
        public final static Property CheckResult = new Property(18, String.class, "CheckResult", false, "CheckResult");
        public final static Property Position = new Property(19, String.class, "Position", false, "Position");
        public final static Property Birth = new Property(20, String.class, "Birth", false, "Birth");
        public final static Property DataType = new Property(21, String.class, "DataType", false, "DataType");
        public final static Property AddDate = new Property(22, String.class, "AddDate", false, "AddDate");
        public final static Property AddUser = new Property(23, String.class, "AddUser", false, "AddUser");
        public final static Property UpdateDate = new Property(24, String.class, "UpdateDate", false, "UpdateDate");
        public final static Property UpdateUser = new Property(25, String.class, "UpdateUser", false, "UpdateUser");
        public final static Property ContactPhone = new Property(26, String.class, "ContactPhone", false, "ContactPhone");
        public final static Property HomeAddress = new Property(27, String.class, "HomeAddress", false, "HomeAddress");
        public final static Property BirthYear = new Property(28, String.class, "BirthYear", false, "BirthYear");
        public final static Property PictureUrl = new Property(29, String.class, "PictureUrl", false, "PictureUrl");
        public final static Property PictureName = new Property(30, String.class, "PictureName", false, "PictureName");
        public final static Property PartyTimeStr = new Property(31, String.class, "PartyTimeStr", false, "PartyTimeStr");
        public final static Property WorkTimeStr = new Property(32, String.class, "WorkTimeStr", false, "WorkTimeStr");
        public final static Property Init = new Property(33, String.class, "Init", false, "Init");
        public final static Property Rank = new Property(34, Integer.class, "Rank", false, "Rank");
        public final static Property IsCadre = new Property(35, String.class, "IsCadre", false, "IsCadre");
        public final static Property CbInit = new Property(36, Integer.class, "CbInit", false, "CbInit");
        public final static Property IsDang = new Property(37, String.class, "IsDang", false, "IsDang");
        public final static Property IsDangW = new Property(38, String.class, "IsDangW", false, "IsDangW");
        public final static Property IsDangJ = new Property(39, String.class, "IsDangJ", false, "IsDangJ");
        public final static Property IsRen = new Property(40, String.class, "IsRen", false, "IsRen");
        public final static Property IsZheng = new Property(41, String.class, "IsZheng", false, "IsZheng");
        public final static Property GerenID = new Property(42, String.class, "GerenID", false, "GerenID");
    }


    public UsersDao(DaoConfig config) {
        super(config);
    }
    
    public UsersDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"Users\" (" + //
                "\"ID\" BLOB PRIMARY KEY ," + // 0: ID
                "\"IsDelete\" INTEGER," + // 1: IsDelete
                "\"RealName\" TEXT," + // 2: RealName
                "\"IDCard\" TEXT," + // 3: IDCard
                "\"Sex\" INTEGER," + // 4: Sex
                "\"Age\" INTEGER," + // 5: Age
                "\"National\" TEXT," + // 6: National
                "\"NativePlace\" TEXT," + // 7: NativePlace
                "\"HomePlace\" TEXT," + // 8: HomePlace
                "\"Health\" TEXT," + // 9: Health
                "\"ZPosition\" TEXT," + // 10: ZPosition
                "\"Specialty\" TEXT," + // 11: Specialty
                "\"QEducation\" TEXT," + // 12: QEducation
                "\"QSchool\" TEXT," + // 13: QSchool
                "\"Education\" TEXT," + // 14: Education
                "\"School\" TEXT," + // 15: School
                "\"Resume\" TEXT," + // 16: Resume
                "\"BonusPenalty\" TEXT," + // 17: BonusPenalty
                "\"CheckResult\" TEXT," + // 18: CheckResult
                "\"Position\" TEXT," + // 19: Position
                "\"Birth\" TEXT," + // 20: Birth
                "\"DataType\" TEXT," + // 21: DataType
                "\"AddDate\" TEXT," + // 22: AddDate
                "\"AddUser\" TEXT," + // 23: AddUser
                "\"UpdateDate\" TEXT," + // 24: UpdateDate
                "\"UpdateUser\" TEXT," + // 25: UpdateUser
                "\"ContactPhone\" TEXT," + // 26: ContactPhone
                "\"HomeAddress\" TEXT," + // 27: HomeAddress
                "\"BirthYear\" TEXT," + // 28: BirthYear
                "\"PictureUrl\" TEXT," + // 29: PictureUrl
                "\"PictureName\" TEXT," + // 30: PictureName
                "\"PartyTimeStr\" TEXT," + // 31: PartyTimeStr
                "\"WorkTimeStr\" TEXT," + // 32: WorkTimeStr
                "\"Init\" TEXT," + // 33: Init
                "\"Rank\" INTEGER," + // 34: Rank
                "\"CbInit\" TEXT," + // 35: IsCadre
                "\"CbInit\" INTEGER," + // 36: CbInit
                "\"IsDang\" TEXT," + // 37: IsDang
                "\"IsDangW\" TEXT," + // 38: IsDangW
                "\"IsDangJ\" TEXT," + // 39: IsDangJ
                "\"IsRen\" TEXT," + // 40: IsRen
                "\"IsZheng\" TEXT," + // 41: IsZheng
                "\"GerenID\" TEXT);"); // 42: GerenID
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"Users\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Users entity) {
        stmt.clearBindings();
 
        byte[] ID = entity.getID();
        if (ID != null) {
            stmt.bindBlob(1, ID);
        }
 
        Integer IsDelete = entity.getIsDelete();
        if (IsDelete != null) {
            stmt.bindLong(2, IsDelete);
        }
 
        String RealName = entity.getRealName();
        if (RealName != null) {
            stmt.bindString(3, RealName);
        }
 
        String IDCard = entity.getIDCard();
        if (IDCard != null) {
            stmt.bindString(4, IDCard);
        }
 
        Integer Sex = entity.getSex();
        if (Sex != null) {
            stmt.bindLong(5, Sex);
        }
 
        Integer Age = entity.getAge();
        if (Age != null) {
            stmt.bindLong(6, Age);
        }
 
        String National = entity.getNational();
        if (National != null) {
            stmt.bindString(7, National);
        }
 
        String NativePlace = entity.getNativePlace();
        if (NativePlace != null) {
            stmt.bindString(8, NativePlace);
        }
 
        String HomePlace = entity.getHomePlace();
        if (HomePlace != null) {
            stmt.bindString(9, HomePlace);
        }
 
        String Health = entity.getHealth();
        if (Health != null) {
            stmt.bindString(10, Health);
        }
 
        String ZPosition = entity.getZPosition();
        if (ZPosition != null) {
            stmt.bindString(11, ZPosition);
        }
 
        String Specialty = entity.getSpecialty();
        if (Specialty != null) {
            stmt.bindString(12, Specialty);
        }
 
        String QEducation = entity.getQEducation();
        if (QEducation != null) {
            stmt.bindString(13, QEducation);
        }
 
        String QSchool = entity.getQSchool();
        if (QSchool != null) {
            stmt.bindString(14, QSchool);
        }
 
        String Education = entity.getEducation();
        if (Education != null) {
            stmt.bindString(15, Education);
        }
 
        String School = entity.getSchool();
        if (School != null) {
            stmt.bindString(16, School);
        }
 
        String Resume = entity.getResume();
        if (Resume != null) {
            stmt.bindString(17, Resume);
        }
 
        String BonusPenalty = entity.getBonusPenalty();
        if (BonusPenalty != null) {
            stmt.bindString(18, BonusPenalty);
        }
 
        String CheckResult = entity.getCheckResult();
        if (CheckResult != null) {
            stmt.bindString(19, CheckResult);
        }
 
        String Position = entity.getPosition();
        if (Position != null) {
            stmt.bindString(20, Position);
        }
 
        String Birth = entity.getBirth();
        if (Birth != null) {
            stmt.bindString(21, Birth);
        }
 
        String DataType = entity.getDataType();
        if (DataType != null) {
            stmt.bindString(22, DataType);
        }
 
        String AddDate = entity.getAddDate();
        if (AddDate != null) {
            stmt.bindString(23, AddDate);
        }
 
        String AddUser = entity.getAddUser();
        if (AddUser != null) {
            stmt.bindString(24, AddUser);
        }
 
        String UpdateDate = entity.getUpdateDate();
        if (UpdateDate != null) {
            stmt.bindString(25, UpdateDate);
        }
 
        String UpdateUser = entity.getUpdateUser();
        if (UpdateUser != null) {
            stmt.bindString(26, UpdateUser);
        }
 
        String ContactPhone = entity.getContactPhone();
        if (ContactPhone != null) {
            stmt.bindString(27, ContactPhone);
        }
 
        String HomeAddress = entity.getHomeAddress();
        if (HomeAddress != null) {
            stmt.bindString(28, HomeAddress);
        }
 
        String BirthYear = entity.getBirthYear();
        if (BirthYear != null) {
            stmt.bindString(29, BirthYear);
        }
 
        String PictureUrl = entity.getPictureUrl();
        if (PictureUrl != null) {
            stmt.bindString(30, PictureUrl);
        }
 
        String PictureName = entity.getPictureName();
        if (PictureName != null) {
            stmt.bindString(31, PictureName);
        }
 
        String PartyTimeStr = entity.getPartyTimeStr();
        if (PartyTimeStr != null) {
            stmt.bindString(32, PartyTimeStr);
        }
 
        String WorkTimeStr = entity.getWorkTimeStr();
        if (WorkTimeStr != null) {
            stmt.bindString(33, WorkTimeStr);
        }
 
        String Init = entity.getInit();
        if (Init != null) {
            stmt.bindString(34, Init);
        }
 
        Integer Rank = entity.getRank();
        if (Rank != null) {
            stmt.bindLong(35, Rank);
        }
 
        String IsCadre = entity.getIsCadre();
        if (IsCadre != null) {
            stmt.bindString(36, IsCadre);
        }
 
        Integer CbInit = entity.getCbInit();
        if (CbInit != null) {
            stmt.bindLong(37, CbInit);
        }
 
        String IsDang = entity.getIsDang();
        if (IsDang != null) {
            stmt.bindString(38, IsDang);
        }
 
        String IsDangW = entity.getIsDangW();
        if (IsDangW != null) {
            stmt.bindString(39, IsDangW);
        }
 
        String IsDangJ = entity.getIsDangJ();
        if (IsDangJ != null) {
            stmt.bindString(40, IsDangJ);
        }
 
        String IsRen = entity.getIsRen();
        if (IsRen != null) {
            stmt.bindString(41, IsRen);
        }
 
        String IsZheng = entity.getIsZheng();
        if (IsZheng != null) {
            stmt.bindString(42, IsZheng);
        }
 
        String GerenID = entity.getGerenID();
        if (GerenID != null) {
            stmt.bindString(43, GerenID);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Users entity) {
        stmt.clearBindings();
 
        byte[] ID = entity.getID();
        if (ID != null) {
            stmt.bindBlob(1, ID);
        }
 
        Integer IsDelete = entity.getIsDelete();
        if (IsDelete != null) {
            stmt.bindLong(2, IsDelete);
        }
 
        String RealName = entity.getRealName();
        if (RealName != null) {
            stmt.bindString(3, RealName);
        }
 
        String IDCard = entity.getIDCard();
        if (IDCard != null) {
            stmt.bindString(4, IDCard);
        }
 
        Integer Sex = entity.getSex();
        if (Sex != null) {
            stmt.bindLong(5, Sex);
        }
 
        Integer Age = entity.getAge();
        if (Age != null) {
            stmt.bindLong(6, Age);
        }
 
        String National = entity.getNational();
        if (National != null) {
            stmt.bindString(7, National);
        }
 
        String NativePlace = entity.getNativePlace();
        if (NativePlace != null) {
            stmt.bindString(8, NativePlace);
        }
 
        String HomePlace = entity.getHomePlace();
        if (HomePlace != null) {
            stmt.bindString(9, HomePlace);
        }
 
        String Health = entity.getHealth();
        if (Health != null) {
            stmt.bindString(10, Health);
        }
 
        String ZPosition = entity.getZPosition();
        if (ZPosition != null) {
            stmt.bindString(11, ZPosition);
        }
 
        String Specialty = entity.getSpecialty();
        if (Specialty != null) {
            stmt.bindString(12, Specialty);
        }
 
        String QEducation = entity.getQEducation();
        if (QEducation != null) {
            stmt.bindString(13, QEducation);
        }
 
        String QSchool = entity.getQSchool();
        if (QSchool != null) {
            stmt.bindString(14, QSchool);
        }
 
        String Education = entity.getEducation();
        if (Education != null) {
            stmt.bindString(15, Education);
        }
 
        String School = entity.getSchool();
        if (School != null) {
            stmt.bindString(16, School);
        }
 
        String Resume = entity.getResume();
        if (Resume != null) {
            stmt.bindString(17, Resume);
        }
 
        String BonusPenalty = entity.getBonusPenalty();
        if (BonusPenalty != null) {
            stmt.bindString(18, BonusPenalty);
        }
 
        String CheckResult = entity.getCheckResult();
        if (CheckResult != null) {
            stmt.bindString(19, CheckResult);
        }
 
        String Position = entity.getPosition();
        if (Position != null) {
            stmt.bindString(20, Position);
        }
 
        String Birth = entity.getBirth();
        if (Birth != null) {
            stmt.bindString(21, Birth);
        }
 
        String DataType = entity.getDataType();
        if (DataType != null) {
            stmt.bindString(22, DataType);
        }
 
        String AddDate = entity.getAddDate();
        if (AddDate != null) {
            stmt.bindString(23, AddDate);
        }
 
        String AddUser = entity.getAddUser();
        if (AddUser != null) {
            stmt.bindString(24, AddUser);
        }
 
        String UpdateDate = entity.getUpdateDate();
        if (UpdateDate != null) {
            stmt.bindString(25, UpdateDate);
        }
 
        String UpdateUser = entity.getUpdateUser();
        if (UpdateUser != null) {
            stmt.bindString(26, UpdateUser);
        }
 
        String ContactPhone = entity.getContactPhone();
        if (ContactPhone != null) {
            stmt.bindString(27, ContactPhone);
        }
 
        String HomeAddress = entity.getHomeAddress();
        if (HomeAddress != null) {
            stmt.bindString(28, HomeAddress);
        }
 
        String BirthYear = entity.getBirthYear();
        if (BirthYear != null) {
            stmt.bindString(29, BirthYear);
        }
 
        String PictureUrl = entity.getPictureUrl();
        if (PictureUrl != null) {
            stmt.bindString(30, PictureUrl);
        }
 
        String PictureName = entity.getPictureName();
        if (PictureName != null) {
            stmt.bindString(31, PictureName);
        }
 
        String PartyTimeStr = entity.getPartyTimeStr();
        if (PartyTimeStr != null) {
            stmt.bindString(32, PartyTimeStr);
        }
 
        String WorkTimeStr = entity.getWorkTimeStr();
        if (WorkTimeStr != null) {
            stmt.bindString(33, WorkTimeStr);
        }
 
        String Init = entity.getInit();
        if (Init != null) {
            stmt.bindString(34, Init);
        }
 
        Integer Rank = entity.getRank();
        if (Rank != null) {
            stmt.bindLong(35, Rank);
        }
 
        String IsCadre = entity.getIsCadre();
        if (IsCadre != null) {
            stmt.bindString(36, IsCadre);
        }
 
        Integer CbInit = entity.getCbInit();
        if (CbInit != null) {
            stmt.bindLong(37, CbInit);
        }
 
        String IsDang = entity.getIsDang();
        if (IsDang != null) {
            stmt.bindString(38, IsDang);
        }
 
        String IsDangW = entity.getIsDangW();
        if (IsDangW != null) {
            stmt.bindString(39, IsDangW);
        }
 
        String IsDangJ = entity.getIsDangJ();
        if (IsDangJ != null) {
            stmt.bindString(40, IsDangJ);
        }
 
        String IsRen = entity.getIsRen();
        if (IsRen != null) {
            stmt.bindString(41, IsRen);
        }
 
        String IsZheng = entity.getIsZheng();
        if (IsZheng != null) {
            stmt.bindString(42, IsZheng);
        }
 
        String GerenID = entity.getGerenID();
        if (GerenID != null) {
            stmt.bindString(43, GerenID);
        }
    }

    @Override
    public byte[] readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getBlob(offset + 0);
    }    

    @Override
    public Users readEntity(Cursor cursor, int offset) {
        Users entity = new Users( //
            cursor.isNull(offset + 0) ? null : cursor.getBlob(offset + 0), // ID
            cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1), // IsDelete
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // RealName
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // IDCard
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // Sex
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // Age
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // National
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // NativePlace
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // HomePlace
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // Health
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // ZPosition
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // Specialty
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // QEducation
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // QSchool
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // Education
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // School
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // Resume
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // BonusPenalty
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // CheckResult
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // Position
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // Birth
            cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21), // DataType
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // AddDate
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // AddUser
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // UpdateDate
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25), // UpdateUser
            cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26), // ContactPhone
            cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27), // HomeAddress
            cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28), // BirthYear
            cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29), // PictureUrl
            cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30), // PictureName
            cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31), // PartyTimeStr
            cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32), // WorkTimeStr
            cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33), // Init
            cursor.isNull(offset + 34) ? null : cursor.getInt(offset + 34), // Rank
            cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35), // IsCadre
            cursor.isNull(offset + 36) ? null : cursor.getInt(offset + 36), // CbInit
            cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37), // IsDang
            cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38), // IsDangW
            cursor.isNull(offset + 39) ? null : cursor.getString(offset + 39), // IsDangJ
            cursor.isNull(offset + 40) ? null : cursor.getString(offset + 40), // IsRen
            cursor.isNull(offset + 41) ? null : cursor.getString(offset + 41), // IsZheng
            cursor.isNull(offset + 42) ? null : cursor.getString(offset + 42) // GerenID
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Users entity, int offset) {
        entity.setID(cursor.isNull(offset + 0) ? null : cursor.getBlob(offset + 0));
        entity.setIsDelete(cursor.isNull(offset + 1) ? null : cursor.getInt(offset + 1));
        entity.setRealName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setIDCard(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSex(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setAge(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setNational(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setNativePlace(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setHomePlace(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setHealth(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setZPosition(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setSpecialty(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setQEducation(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setQSchool(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setEducation(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setSchool(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setResume(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setBonusPenalty(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setCheckResult(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setPosition(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setBirth(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setDataType(cursor.isNull(offset + 21) ? null : cursor.getString(offset + 21));
        entity.setAddDate(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setAddUser(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setUpdateDate(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setUpdateUser(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
        entity.setContactPhone(cursor.isNull(offset + 26) ? null : cursor.getString(offset + 26));
        entity.setHomeAddress(cursor.isNull(offset + 27) ? null : cursor.getString(offset + 27));
        entity.setBirthYear(cursor.isNull(offset + 28) ? null : cursor.getString(offset + 28));
        entity.setPictureUrl(cursor.isNull(offset + 29) ? null : cursor.getString(offset + 29));
        entity.setPictureName(cursor.isNull(offset + 30) ? null : cursor.getString(offset + 30));
        entity.setPartyTimeStr(cursor.isNull(offset + 31) ? null : cursor.getString(offset + 31));
        entity.setWorkTimeStr(cursor.isNull(offset + 32) ? null : cursor.getString(offset + 32));
        entity.setInit(cursor.isNull(offset + 33) ? null : cursor.getString(offset + 33));
        entity.setRank(cursor.isNull(offset + 34) ? null : cursor.getInt(offset + 34));
        entity.setIsCadre(cursor.isNull(offset + 35) ? null : cursor.getString(offset + 35));
        entity.setCbInit(cursor.isNull(offset + 36) ? null : cursor.getInt(offset + 36));
        entity.setIsDang(cursor.isNull(offset + 37) ? null : cursor.getString(offset + 37));
        entity.setIsDangW(cursor.isNull(offset + 38) ? null : cursor.getString(offset + 38));
        entity.setIsDangJ(cursor.isNull(offset + 39) ? null : cursor.getString(offset + 39));
        entity.setIsRen(cursor.isNull(offset + 40) ? null : cursor.getString(offset + 40));
        entity.setIsZheng(cursor.isNull(offset + 41) ? null : cursor.getString(offset + 41));
        entity.setGerenID(cursor.isNull(offset + 42) ? null : cursor.getString(offset + 42));
     }
    
    @Override
    protected final byte[] updateKeyAfterInsert(Users entity, long rowId) {
        return entity.getID();
    }
    
    @Override
    public byte[] getKey(Users entity) {
        if(entity != null) {
            return entity.getID();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Users entity) {
        return entity.getID() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}