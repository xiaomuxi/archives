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
 * DAO for table "GiftCards".
*/
public class GiftCardsDao extends AbstractDao<GiftCards, byte[]> {

    public static final String TABLENAME = "GiftCards";

    /**
     * Properties of entity GiftCards.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, byte[].class, "id", true, "ID");
        public final static Property GiftHandID = new Property(1, byte[].class, "giftHandID", false, "GiftHandID");
        public final static Property CardTime = new Property(2, String.class, "cardTime", false, "CardTime");
        public final static Property CardNumber = new Property(3, String.class, "cardNumber", false, "CardNumber");
        public final static Property CardAmount = new Property(4, Integer.class, "cardAmount", false, "CardAmount");
        public final static Property CardName = new Property(5, String.class, "cardName", false, "CardName");
        public final static Property CardNote = new Property(6, String.class, "cardNote", false, "CardNote");
        public final static Property IsDelete = new Property(7, Integer.class, "isDelete", false, "IsDelete");
        public final static Property AddTime = new Property(8, String.class, "addTime", false, "AddTime");
    }


    public GiftCardsDao(DaoConfig config) {
        super(config);
    }
    
    public GiftCardsDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GiftCards\" (" + //
                "\"ID\" BLOB PRIMARY KEY ," + // 0: id
                "\"GiftHandID\" BLOB," + // 1: giftHandID
                "\"CardTime\" TEXT," + // 2: cardTime
                "\"CardNumber\" TEXT," + // 3: cardNumber
                "\"CardAmount\" INTEGER," + // 4: cardAmount
                "\"CardName\" TEXT," + // 5: cardName
                "\"CardNote\" TEXT," + // 6: cardNote
                "\"IsDelete\" INTEGER," + // 7: isDelete
                "\"AddTime\" TEXT);"); // 8: addTime
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GiftCards\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, GiftCards entity) {
        stmt.clearBindings();
 
        byte[] id = entity.getId();
        if (id != null) {
            stmt.bindBlob(1, id);
        }
 
        byte[] giftHandID = entity.getGiftHandID();
        if (giftHandID != null) {
            stmt.bindBlob(2, giftHandID);
        }
 
        String cardTime = entity.getCardTime();
        if (cardTime != null) {
            stmt.bindString(3, cardTime);
        }
 
        String cardNumber = entity.getCardNumber();
        if (cardNumber != null) {
            stmt.bindString(4, cardNumber);
        }
 
        Integer cardAmount = entity.getCardAmount();
        if (cardAmount != null) {
            stmt.bindLong(5, cardAmount);
        }
 
        String cardName = entity.getCardName();
        if (cardName != null) {
            stmt.bindString(6, cardName);
        }
 
        String cardNote = entity.getCardNote();
        if (cardNote != null) {
            stmt.bindString(7, cardNote);
        }
 
        Integer isDelete = entity.getIsDelete();
        if (isDelete != null) {
            stmt.bindLong(8, isDelete);
        }
 
        String addTime = entity.getAddTime();
        if (addTime != null) {
            stmt.bindString(9, addTime);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, GiftCards entity) {
        stmt.clearBindings();
 
        byte[] id = entity.getId();
        if (id != null) {
            stmt.bindBlob(1, id);
        }
 
        byte[] giftHandID = entity.getGiftHandID();
        if (giftHandID != null) {
            stmt.bindBlob(2, giftHandID);
        }
 
        String cardTime = entity.getCardTime();
        if (cardTime != null) {
            stmt.bindString(3, cardTime);
        }
 
        String cardNumber = entity.getCardNumber();
        if (cardNumber != null) {
            stmt.bindString(4, cardNumber);
        }
 
        Integer cardAmount = entity.getCardAmount();
        if (cardAmount != null) {
            stmt.bindLong(5, cardAmount);
        }
 
        String cardName = entity.getCardName();
        if (cardName != null) {
            stmt.bindString(6, cardName);
        }
 
        String cardNote = entity.getCardNote();
        if (cardNote != null) {
            stmt.bindString(7, cardNote);
        }
 
        Integer isDelete = entity.getIsDelete();
        if (isDelete != null) {
            stmt.bindLong(8, isDelete);
        }
 
        String addTime = entity.getAddTime();
        if (addTime != null) {
            stmt.bindString(9, addTime);
        }
    }

    @Override
    public byte[] readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getBlob(offset + 0);
    }    

    @Override
    public GiftCards readEntity(Cursor cursor, int offset) {
        GiftCards entity = new GiftCards( //
            cursor.isNull(offset + 0) ? null : cursor.getBlob(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getBlob(offset + 1), // giftHandID
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // cardTime
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // cardNumber
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // cardAmount
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // cardName
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // cardNote
            cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7), // isDelete
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8) // addTime
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, GiftCards entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getBlob(offset + 0));
        entity.setGiftHandID(cursor.isNull(offset + 1) ? null : cursor.getBlob(offset + 1));
        entity.setCardTime(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setCardNumber(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCardAmount(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setCardName(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setCardNote(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setIsDelete(cursor.isNull(offset + 7) ? null : cursor.getInt(offset + 7));
        entity.setAddTime(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
     }
    
    @Override
    protected final byte[] updateKeyAfterInsert(GiftCards entity, long rowId) {
        return entity.getId();
    }
    
    @Override
    public byte[] getKey(GiftCards entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(GiftCards entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
