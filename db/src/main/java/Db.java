import java.util.UUID;

public class Db {

    private DbSetting dbSetting;
    private MyEntity myEntity;

    public Db(DbSetting dbSetting) {
        dbSetting = dbSetting;
        myEntity = new MyEntity("first");
        myEntity.setId(UUID.randomUUID());
    }

    public DbSetting getDbSetting() {
        return dbSetting;
    }

    public MyEntity getMyEntity() {
        return myEntity;
    }

    public void setMyEntity(MyEntity myEntity) {
        this.myEntity = myEntity;
    }
}