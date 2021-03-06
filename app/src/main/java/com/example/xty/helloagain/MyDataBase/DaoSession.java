package com.example.xty.helloagain.MyDataBase;

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
 * @see AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig courseInfoDaoConfig;
    private final DaoConfig fridayTableDaoConfig;
    private final DaoConfig holidaysDaoConfig;
    private final DaoConfig mondayTableDaoConfig;
    private final DaoConfig myCurriculumTableDaoConfig;
    private final DaoConfig saturdayTableDaoConfig;
    private final DaoConfig settingsDaoConfig;
    private final DaoConfig sundayTableDaoConfig;
    private final DaoConfig thursdayTableDaoConfig;
    private final DaoConfig tuesdayTableDaoConfig;
    private final DaoConfig wednesdayTableDaoConfig;
    private final DaoConfig classroomInfoDaoConfig;

    private final CourseInfoDao courseInfoDao;
    private final FridayTableDao fridayTableDao;
    private final HolidaysDao holidaysDao;
    private final MondayTableDao mondayTableDao;
    private final MyCurriculumTableDao myCurriculumTableDao;
    private final SaturdayTableDao saturdayTableDao;
    private final SettingsDao settingsDao;
    private final SundayTableDao sundayTableDao;
    private final ThursdayTableDao thursdayTableDao;
    private final TuesdayTableDao tuesdayTableDao;
    private final WednesdayTableDao wednesdayTableDao;
    private final ClassroomInfoDao classroomInfoDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        courseInfoDaoConfig = daoConfigMap.get(CourseInfoDao.class).clone();
        courseInfoDaoConfig.initIdentityScope(type);

        fridayTableDaoConfig = daoConfigMap.get(FridayTableDao.class).clone();
        fridayTableDaoConfig.initIdentityScope(type);

        holidaysDaoConfig = daoConfigMap.get(HolidaysDao.class).clone();
        holidaysDaoConfig.initIdentityScope(type);

        mondayTableDaoConfig = daoConfigMap.get(MondayTableDao.class).clone();
        mondayTableDaoConfig.initIdentityScope(type);

        myCurriculumTableDaoConfig = daoConfigMap.get(MyCurriculumTableDao.class).clone();
        myCurriculumTableDaoConfig.initIdentityScope(type);

        saturdayTableDaoConfig = daoConfigMap.get(SaturdayTableDao.class).clone();
        saturdayTableDaoConfig.initIdentityScope(type);

        settingsDaoConfig = daoConfigMap.get(SettingsDao.class).clone();
        settingsDaoConfig.initIdentityScope(type);

        sundayTableDaoConfig = daoConfigMap.get(SundayTableDao.class).clone();
        sundayTableDaoConfig.initIdentityScope(type);

        thursdayTableDaoConfig = daoConfigMap.get(ThursdayTableDao.class).clone();
        thursdayTableDaoConfig.initIdentityScope(type);

        tuesdayTableDaoConfig = daoConfigMap.get(TuesdayTableDao.class).clone();
        tuesdayTableDaoConfig.initIdentityScope(type);

        wednesdayTableDaoConfig = daoConfigMap.get(WednesdayTableDao.class).clone();
        wednesdayTableDaoConfig.initIdentityScope(type);

        classroomInfoDaoConfig = daoConfigMap.get(ClassroomInfoDao.class).clone();
        classroomInfoDaoConfig.initIdentityScope(type);

        courseInfoDao = new CourseInfoDao(courseInfoDaoConfig, this);
        fridayTableDao = new FridayTableDao(fridayTableDaoConfig, this);
        holidaysDao = new HolidaysDao(holidaysDaoConfig, this);
        mondayTableDao = new MondayTableDao(mondayTableDaoConfig, this);
        myCurriculumTableDao = new MyCurriculumTableDao(myCurriculumTableDaoConfig, this);
        saturdayTableDao = new SaturdayTableDao(saturdayTableDaoConfig, this);
        settingsDao = new SettingsDao(settingsDaoConfig, this);
        sundayTableDao = new SundayTableDao(sundayTableDaoConfig, this);
        thursdayTableDao = new ThursdayTableDao(thursdayTableDaoConfig, this);
        tuesdayTableDao = new TuesdayTableDao(tuesdayTableDaoConfig, this);
        wednesdayTableDao = new WednesdayTableDao(wednesdayTableDaoConfig, this);
        classroomInfoDao = new ClassroomInfoDao(classroomInfoDaoConfig, this);

        registerDao(CourseInfo.class, courseInfoDao);
        registerDao(FridayTable.class, fridayTableDao);
        registerDao(Holidays.class, holidaysDao);
        registerDao(MondayTable.class, mondayTableDao);
        registerDao(MyCurriculumTable.class, myCurriculumTableDao);
        registerDao(SaturdayTable.class, saturdayTableDao);
        registerDao(Settings.class, settingsDao);
        registerDao(SundayTable.class, sundayTableDao);
        registerDao(ThursdayTable.class, thursdayTableDao);
        registerDao(TuesdayTable.class, tuesdayTableDao);
        registerDao(WednesdayTable.class, wednesdayTableDao);
        registerDao(ClassroomInfo.class, classroomInfoDao);
    }
    
    public void clear() {
        courseInfoDaoConfig.getIdentityScope().clear();
        fridayTableDaoConfig.getIdentityScope().clear();
        holidaysDaoConfig.getIdentityScope().clear();
        mondayTableDaoConfig.getIdentityScope().clear();
        myCurriculumTableDaoConfig.getIdentityScope().clear();
        saturdayTableDaoConfig.getIdentityScope().clear();
        settingsDaoConfig.getIdentityScope().clear();
        sundayTableDaoConfig.getIdentityScope().clear();
        thursdayTableDaoConfig.getIdentityScope().clear();
        tuesdayTableDaoConfig.getIdentityScope().clear();
        wednesdayTableDaoConfig.getIdentityScope().clear();
        classroomInfoDaoConfig.getIdentityScope().clear();
    }

    public CourseInfoDao getCourseInfoDao() {
        return courseInfoDao;
    }

    public FridayTableDao getFridayTableDao() {
        return fridayTableDao;
    }

    public HolidaysDao getHolidaysDao() {
        return holidaysDao;
    }

    public MondayTableDao getMondayTableDao() {
        return mondayTableDao;
    }

    public MyCurriculumTableDao getMyCurriculumTableDao() {
        return myCurriculumTableDao;
    }

    public SaturdayTableDao getSaturdayTableDao() {
        return saturdayTableDao;
    }

    public SettingsDao getSettingsDao() {
        return settingsDao;
    }

    public SundayTableDao getSundayTableDao() {
        return sundayTableDao;
    }

    public ThursdayTableDao getThursdayTableDao() {
        return thursdayTableDao;
    }

    public TuesdayTableDao getTuesdayTableDao() {
        return tuesdayTableDao;
    }

    public WednesdayTableDao getWednesdayTableDao() {
        return wednesdayTableDao;
    }

    public ClassroomInfoDao getClassroomInfoDao() {
        return classroomInfoDao;
    }

}
