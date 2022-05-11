package cn.book.pojo;

public class bookbackup {
    private String backup_id;

    public String getBackup_id() {
        return backup_id;
    }

    public void setBackup_id(String backup_id) {
        this.backup_id = backup_id;
    }

    @Override
    public String toString() {
        return "bookbackup{" +
                "backup_id='" + backup_id + '\'' +
                '}';
    }
}
