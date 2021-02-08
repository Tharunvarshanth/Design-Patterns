package builder;

import java.util.Date;

public class AuditLog {

    private String userId;
    private Date timestamp;
    private String actionType;
    private String resource;

    public AuditLog (){}

    public AuditLog(String userId, Date timestamp, String actionType, String resource) {
        this.userId = userId;
        this.timestamp = timestamp;
        this.actionType = actionType;
        this.resource = resource;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public static class AuditLogBuilder{
        private String userId;
        private Date timestamp;
        private String actionType;
        private String resource;

        public  AuditLogBuilder(String userId){
            this.userId = userId;
        }

        public  AuditLogBuilder by(String user){
            this.userId = user;
            return this;
        }
        public AuditLogBuilder on(Date timestamp){
            this.timestamp = timestamp;
            return this;
        }

        public AuditLogBuilder withAction(String action){
            this.actionType = action;
            return this;
        }

        public AuditLogBuilder on(String resource){
            this.resource = resource;
            return this;
        }

        public AuditLog build(){
            AuditLog auditLog = new AuditLog();
             auditLog.setUserId(userId);
             auditLog.setTimestamp(timestamp);
             auditLog.setActionType(actionType);
             auditLog.setResource(resource);
             return auditLog;
        }


    }


}
