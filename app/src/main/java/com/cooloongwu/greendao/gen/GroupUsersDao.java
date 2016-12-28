package com.cooloongwu.greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.cooloongwu.coolchat.entity.GroupUsers;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "GROUP_USERS".
 */
public class GroupUsersDao extends AbstractDao<GroupUsers, Long> {

    public static final String TABLENAME = "GROUP_USERS";

    /**
     * Properties of entity GroupUsers.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property UserId = new Property(1, int.class, "userId", false, "USER_ID");
        public final static Property UserName = new Property(2, String.class, "userName", false, "USER_NAME");
        public final static Property UserAvatar = new Property(3, String.class, "userAvatar", false, "USER_AVATAR");
        public final static Property UserSex = new Property(4, String.class, "userSex", false, "USER_SEX");
    }


    public GroupUsersDao(DaoConfig config) {
        super(config);
    }

    public GroupUsersDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"GROUP_USERS\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"USER_ID\" INTEGER NOT NULL ," + // 1: userId
                "\"USER_NAME\" TEXT," + // 2: userName
                "\"USER_AVATAR\" TEXT," + // 3: userAvatar
                "\"USER_SEX\" TEXT);"); // 4: userSex
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"GROUP_USERS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, GroupUsers entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getUserId());
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(3, userName);
        }
 
        String userAvatar = entity.getUserAvatar();
        if (userAvatar != null) {
            stmt.bindString(4, userAvatar);
        }
 
        String userSex = entity.getUserSex();
        if (userSex != null) {
            stmt.bindString(5, userSex);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, GroupUsers entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindLong(2, entity.getUserId());
 
        String userName = entity.getUserName();
        if (userName != null) {
            stmt.bindString(3, userName);
        }
 
        String userAvatar = entity.getUserAvatar();
        if (userAvatar != null) {
            stmt.bindString(4, userAvatar);
        }
 
        String userSex = entity.getUserSex();
        if (userSex != null) {
            stmt.bindString(5, userSex);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public GroupUsers readEntity(Cursor cursor, int offset) {
        GroupUsers entity = new GroupUsers( //
                cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
                cursor.getInt(offset + 1), // userId
                cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // userName
                cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // userAvatar
                cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4) // userSex
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, GroupUsers entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setUserId(cursor.getInt(offset + 1));
        entity.setUserName(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setUserAvatar(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setUserSex(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(GroupUsers entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(GroupUsers entity) {
        if (entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(GroupUsers entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
