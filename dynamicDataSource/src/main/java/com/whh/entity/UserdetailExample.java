package com.whh.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserdetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserdetailIdIsNull() {
            addCriterion("USERDETAIL_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserdetailIdIsNotNull() {
            addCriterion("USERDETAIL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserdetailIdEqualTo(Long value) {
            addCriterion("USERDETAIL_ID =", value, "userdetailId");
            return (Criteria) this;
        }

        public Criteria andUserdetailIdNotEqualTo(Long value) {
            addCriterion("USERDETAIL_ID <>", value, "userdetailId");
            return (Criteria) this;
        }

        public Criteria andUserdetailIdGreaterThan(Long value) {
            addCriterion("USERDETAIL_ID >", value, "userdetailId");
            return (Criteria) this;
        }

        public Criteria andUserdetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USERDETAIL_ID >=", value, "userdetailId");
            return (Criteria) this;
        }

        public Criteria andUserdetailIdLessThan(Long value) {
            addCriterion("USERDETAIL_ID <", value, "userdetailId");
            return (Criteria) this;
        }

        public Criteria andUserdetailIdLessThanOrEqualTo(Long value) {
            addCriterion("USERDETAIL_ID <=", value, "userdetailId");
            return (Criteria) this;
        }

        public Criteria andUserdetailIdIn(List<Long> values) {
            addCriterion("USERDETAIL_ID in", values, "userdetailId");
            return (Criteria) this;
        }

        public Criteria andUserdetailIdNotIn(List<Long> values) {
            addCriterion("USERDETAIL_ID not in", values, "userdetailId");
            return (Criteria) this;
        }

        public Criteria andUserdetailIdBetween(Long value1, Long value2) {
            addCriterion("USERDETAIL_ID between", value1, value2, "userdetailId");
            return (Criteria) this;
        }

        public Criteria andUserdetailIdNotBetween(Long value1, Long value2) {
            addCriterion("USERDETAIL_ID not between", value1, value2, "userdetailId");
            return (Criteria) this;
        }

        public Criteria andHeadpathIsNull() {
            addCriterion("HEADPATH is null");
            return (Criteria) this;
        }

        public Criteria andHeadpathIsNotNull() {
            addCriterion("HEADPATH is not null");
            return (Criteria) this;
        }

        public Criteria andHeadpathEqualTo(String value) {
            addCriterion("HEADPATH =", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathNotEqualTo(String value) {
            addCriterion("HEADPATH <>", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathGreaterThan(String value) {
            addCriterion("HEADPATH >", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathGreaterThanOrEqualTo(String value) {
            addCriterion("HEADPATH >=", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathLessThan(String value) {
            addCriterion("HEADPATH <", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathLessThanOrEqualTo(String value) {
            addCriterion("HEADPATH <=", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathLike(String value) {
            addCriterion("HEADPATH like", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathNotLike(String value) {
            addCriterion("HEADPATH not like", value, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathIn(List<String> values) {
            addCriterion("HEADPATH in", values, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathNotIn(List<String> values) {
            addCriterion("HEADPATH not in", values, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathBetween(String value1, String value2) {
            addCriterion("HEADPATH between", value1, value2, "headpath");
            return (Criteria) this;
        }

        public Criteria andHeadpathNotBetween(String value1, String value2) {
            addCriterion("HEADPATH not between", value1, value2, "headpath");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNull() {
            addCriterion("USER_REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIsNotNull() {
            addCriterion("USER_REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserRealNameEqualTo(String value) {
            addCriterion("USER_REAL_NAME =", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotEqualTo(String value) {
            addCriterion("USER_REAL_NAME <>", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThan(String value) {
            addCriterion("USER_REAL_NAME >", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_REAL_NAME >=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThan(String value) {
            addCriterion("USER_REAL_NAME <", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLessThanOrEqualTo(String value) {
            addCriterion("USER_REAL_NAME <=", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameLike(String value) {
            addCriterion("USER_REAL_NAME like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotLike(String value) {
            addCriterion("USER_REAL_NAME not like", value, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameIn(List<String> values) {
            addCriterion("USER_REAL_NAME in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotIn(List<String> values) {
            addCriterion("USER_REAL_NAME not in", values, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameBetween(String value1, String value2) {
            addCriterion("USER_REAL_NAME between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUserRealNameNotBetween(String value1, String value2) {
            addCriterion("USER_REAL_NAME not between", value1, value2, "userRealName");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andSeifinformationIsNull() {
            addCriterion("SEIFINFORMATION is null");
            return (Criteria) this;
        }

        public Criteria andSeifinformationIsNotNull() {
            addCriterion("SEIFINFORMATION is not null");
            return (Criteria) this;
        }

        public Criteria andSeifinformationEqualTo(String value) {
            addCriterion("SEIFINFORMATION =", value, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andSeifinformationNotEqualTo(String value) {
            addCriterion("SEIFINFORMATION <>", value, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andSeifinformationGreaterThan(String value) {
            addCriterion("SEIFINFORMATION >", value, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andSeifinformationGreaterThanOrEqualTo(String value) {
            addCriterion("SEIFINFORMATION >=", value, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andSeifinformationLessThan(String value) {
            addCriterion("SEIFINFORMATION <", value, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andSeifinformationLessThanOrEqualTo(String value) {
            addCriterion("SEIFINFORMATION <=", value, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andSeifinformationLike(String value) {
            addCriterion("SEIFINFORMATION like", value, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andSeifinformationNotLike(String value) {
            addCriterion("SEIFINFORMATION not like", value, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andSeifinformationIn(List<String> values) {
            addCriterion("SEIFINFORMATION in", values, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andSeifinformationNotIn(List<String> values) {
            addCriterion("SEIFINFORMATION not in", values, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andSeifinformationBetween(String value1, String value2) {
            addCriterion("SEIFINFORMATION between", value1, value2, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andSeifinformationNotBetween(String value1, String value2) {
            addCriterion("SEIFINFORMATION not between", value1, value2, "seifinformation");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeIsNull() {
            addCriterion("MAINTENANCETIME is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeIsNotNull() {
            addCriterion("MAINTENANCETIME is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeEqualTo(Date value) {
            addCriterion("MAINTENANCETIME =", value, "maintenancetime");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeNotEqualTo(Date value) {
            addCriterion("MAINTENANCETIME <>", value, "maintenancetime");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeGreaterThan(Date value) {
            addCriterion("MAINTENANCETIME >", value, "maintenancetime");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MAINTENANCETIME >=", value, "maintenancetime");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeLessThan(Date value) {
            addCriterion("MAINTENANCETIME <", value, "maintenancetime");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeLessThanOrEqualTo(Date value) {
            addCriterion("MAINTENANCETIME <=", value, "maintenancetime");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeIn(List<Date> values) {
            addCriterion("MAINTENANCETIME in", values, "maintenancetime");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeNotIn(List<Date> values) {
            addCriterion("MAINTENANCETIME not in", values, "maintenancetime");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeBetween(Date value1, Date value2) {
            addCriterion("MAINTENANCETIME between", value1, value2, "maintenancetime");
            return (Criteria) this;
        }

        public Criteria andMaintenancetimeNotBetween(Date value1, Date value2) {
            addCriterion("MAINTENANCETIME not between", value1, value2, "maintenancetime");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameIsNull() {
            addCriterion("MAINTENANCENAME is null");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameIsNotNull() {
            addCriterion("MAINTENANCENAME is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameEqualTo(String value) {
            addCriterion("MAINTENANCENAME =", value, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameNotEqualTo(String value) {
            addCriterion("MAINTENANCENAME <>", value, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameGreaterThan(String value) {
            addCriterion("MAINTENANCENAME >", value, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameGreaterThanOrEqualTo(String value) {
            addCriterion("MAINTENANCENAME >=", value, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameLessThan(String value) {
            addCriterion("MAINTENANCENAME <", value, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameLessThanOrEqualTo(String value) {
            addCriterion("MAINTENANCENAME <=", value, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameLike(String value) {
            addCriterion("MAINTENANCENAME like", value, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameNotLike(String value) {
            addCriterion("MAINTENANCENAME not like", value, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameIn(List<String> values) {
            addCriterion("MAINTENANCENAME in", values, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameNotIn(List<String> values) {
            addCriterion("MAINTENANCENAME not in", values, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameBetween(String value1, String value2) {
            addCriterion("MAINTENANCENAME between", value1, value2, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andMaintenancenameNotBetween(String value1, String value2) {
            addCriterion("MAINTENANCENAME not between", value1, value2, "maintenancename");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNull() {
            addCriterion("GRADUATED_SCHOOL is null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIsNotNull() {
            addCriterion("GRADUATED_SCHOOL is not null");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL =", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL <>", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThan(String value) {
            addCriterion("GRADUATED_SCHOOL >", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolGreaterThanOrEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL >=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThan(String value) {
            addCriterion("GRADUATED_SCHOOL <", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLessThanOrEqualTo(String value) {
            addCriterion("GRADUATED_SCHOOL <=", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolLike(String value) {
            addCriterion("GRADUATED_SCHOOL like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotLike(String value) {
            addCriterion("GRADUATED_SCHOOL not like", value, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolIn(List<String> values) {
            addCriterion("GRADUATED_SCHOOL in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotIn(List<String> values) {
            addCriterion("GRADUATED_SCHOOL not in", values, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolBetween(String value1, String value2) {
            addCriterion("GRADUATED_SCHOOL between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andGraduatedSchoolNotBetween(String value1, String value2) {
            addCriterion("GRADUATED_SCHOOL not between", value1, value2, "graduatedSchool");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNull() {
            addCriterion("ENTRY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIsNotNull() {
            addCriterion("ENTRY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTimeEqualTo(Date value) {
            addCriterion("ENTRY_TIME =", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotEqualTo(Date value) {
            addCriterion("ENTRY_TIME <>", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThan(Date value) {
            addCriterion("ENTRY_TIME >", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ENTRY_TIME >=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThan(Date value) {
            addCriterion("ENTRY_TIME <", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeLessThanOrEqualTo(Date value) {
            addCriterion("ENTRY_TIME <=", value, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeIn(List<Date> values) {
            addCriterion("ENTRY_TIME in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotIn(List<Date> values) {
            addCriterion("ENTRY_TIME not in", values, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeBetween(Date value1, Date value2) {
            addCriterion("ENTRY_TIME between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andEntryTimeNotBetween(Date value1, Date value2) {
            addCriterion("ENTRY_TIME not between", value1, value2, "entryTime");
            return (Criteria) this;
        }

        public Criteria andRegionIsNull() {
            addCriterion("REGION is null");
            return (Criteria) this;
        }

        public Criteria andRegionIsNotNull() {
            addCriterion("REGION is not null");
            return (Criteria) this;
        }

        public Criteria andRegionEqualTo(String value) {
            addCriterion("REGION =", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotEqualTo(String value) {
            addCriterion("REGION <>", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThan(String value) {
            addCriterion("REGION >", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionGreaterThanOrEqualTo(String value) {
            addCriterion("REGION >=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThan(String value) {
            addCriterion("REGION <", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLessThanOrEqualTo(String value) {
            addCriterion("REGION <=", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionLike(String value) {
            addCriterion("REGION like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotLike(String value) {
            addCriterion("REGION not like", value, "region");
            return (Criteria) this;
        }

        public Criteria andRegionIn(List<String> values) {
            addCriterion("REGION in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotIn(List<String> values) {
            addCriterion("REGION not in", values, "region");
            return (Criteria) this;
        }

        public Criteria andRegionBetween(String value1, String value2) {
            addCriterion("REGION between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andRegionNotBetween(String value1, String value2) {
            addCriterion("REGION not between", value1, value2, "region");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("JOB =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("JOB >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("JOB <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("JOB like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("JOB not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("JOB in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("JOB not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNull() {
            addCriterion("ROLE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIsNotNull() {
            addCriterion("ROLE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRoleTypeEqualTo(String value) {
            addCriterion("ROLE_TYPE =", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotEqualTo(String value) {
            addCriterion("ROLE_TYPE <>", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThan(String value) {
            addCriterion("ROLE_TYPE >", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ROLE_TYPE >=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThan(String value) {
            addCriterion("ROLE_TYPE <", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLessThanOrEqualTo(String value) {
            addCriterion("ROLE_TYPE <=", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeLike(String value) {
            addCriterion("ROLE_TYPE like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotLike(String value) {
            addCriterion("ROLE_TYPE not like", value, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeIn(List<String> values) {
            addCriterion("ROLE_TYPE in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotIn(List<String> values) {
            addCriterion("ROLE_TYPE not in", values, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeBetween(String value1, String value2) {
            addCriterion("ROLE_TYPE between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andRoleTypeNotBetween(String value1, String value2) {
            addCriterion("ROLE_TYPE not between", value1, value2, "roleType");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeIsNull() {
            addCriterion("BRANCH_OFFICE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeIsNotNull() {
            addCriterion("BRANCH_OFFICE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeEqualTo(String value) {
            addCriterion("BRANCH_OFFICE_CODE =", value, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeNotEqualTo(String value) {
            addCriterion("BRANCH_OFFICE_CODE <>", value, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeGreaterThan(String value) {
            addCriterion("BRANCH_OFFICE_CODE >", value, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_OFFICE_CODE >=", value, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeLessThan(String value) {
            addCriterion("BRANCH_OFFICE_CODE <", value, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_OFFICE_CODE <=", value, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeLike(String value) {
            addCriterion("BRANCH_OFFICE_CODE like", value, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeNotLike(String value) {
            addCriterion("BRANCH_OFFICE_CODE not like", value, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeIn(List<String> values) {
            addCriterion("BRANCH_OFFICE_CODE in", values, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeNotIn(List<String> values) {
            addCriterion("BRANCH_OFFICE_CODE not in", values, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeBetween(String value1, String value2) {
            addCriterion("BRANCH_OFFICE_CODE between", value1, value2, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeCodeNotBetween(String value1, String value2) {
            addCriterion("BRANCH_OFFICE_CODE not between", value1, value2, "branchOfficeCode");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeIsNull() {
            addCriterion("BRANCH_OFFICE is null");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeIsNotNull() {
            addCriterion("BRANCH_OFFICE is not null");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeEqualTo(String value) {
            addCriterion("BRANCH_OFFICE =", value, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeNotEqualTo(String value) {
            addCriterion("BRANCH_OFFICE <>", value, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeGreaterThan(String value) {
            addCriterion("BRANCH_OFFICE >", value, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeGreaterThanOrEqualTo(String value) {
            addCriterion("BRANCH_OFFICE >=", value, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeLessThan(String value) {
            addCriterion("BRANCH_OFFICE <", value, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeLessThanOrEqualTo(String value) {
            addCriterion("BRANCH_OFFICE <=", value, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeLike(String value) {
            addCriterion("BRANCH_OFFICE like", value, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeNotLike(String value) {
            addCriterion("BRANCH_OFFICE not like", value, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeIn(List<String> values) {
            addCriterion("BRANCH_OFFICE in", values, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeNotIn(List<String> values) {
            addCriterion("BRANCH_OFFICE not in", values, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeBetween(String value1, String value2) {
            addCriterion("BRANCH_OFFICE between", value1, value2, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBranchOfficeNotBetween(String value1, String value2) {
            addCriterion("BRANCH_OFFICE not between", value1, value2, "branchOffice");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptIsNull() {
            addCriterion("BUSINESS_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptIsNotNull() {
            addCriterion("BUSINESS_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptEqualTo(String value) {
            addCriterion("BUSINESS_DEPT =", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptNotEqualTo(String value) {
            addCriterion("BUSINESS_DEPT <>", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptGreaterThan(String value) {
            addCriterion("BUSINESS_DEPT >", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_DEPT >=", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptLessThan(String value) {
            addCriterion("BUSINESS_DEPT <", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_DEPT <=", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptLike(String value) {
            addCriterion("BUSINESS_DEPT like", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptNotLike(String value) {
            addCriterion("BUSINESS_DEPT not like", value, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptIn(List<String> values) {
            addCriterion("BUSINESS_DEPT in", values, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptNotIn(List<String> values) {
            addCriterion("BUSINESS_DEPT not in", values, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptBetween(String value1, String value2) {
            addCriterion("BUSINESS_DEPT between", value1, value2, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessDeptNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_DEPT not between", value1, value2, "businessDept");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIsNull() {
            addCriterion("BUSINESS_GROUP is null");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIsNotNull() {
            addCriterion("BUSINESS_GROUP is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupEqualTo(String value) {
            addCriterion("BUSINESS_GROUP =", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupNotEqualTo(String value) {
            addCriterion("BUSINESS_GROUP <>", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupGreaterThan(String value) {
            addCriterion("BUSINESS_GROUP >", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_GROUP >=", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupLessThan(String value) {
            addCriterion("BUSINESS_GROUP <", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_GROUP <=", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupLike(String value) {
            addCriterion("BUSINESS_GROUP like", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupNotLike(String value) {
            addCriterion("BUSINESS_GROUP not like", value, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupIn(List<String> values) {
            addCriterion("BUSINESS_GROUP in", values, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupNotIn(List<String> values) {
            addCriterion("BUSINESS_GROUP not in", values, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupBetween(String value1, String value2) {
            addCriterion("BUSINESS_GROUP between", value1, value2, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andBusinessGroupNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_GROUP not between", value1, value2, "businessGroup");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andIsFullIsNull() {
            addCriterion("IS_FULL is null");
            return (Criteria) this;
        }

        public Criteria andIsFullIsNotNull() {
            addCriterion("IS_FULL is not null");
            return (Criteria) this;
        }

        public Criteria andIsFullEqualTo(String value) {
            addCriterion("IS_FULL =", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotEqualTo(String value) {
            addCriterion("IS_FULL <>", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullGreaterThan(String value) {
            addCriterion("IS_FULL >", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FULL >=", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLessThan(String value) {
            addCriterion("IS_FULL <", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLessThanOrEqualTo(String value) {
            addCriterion("IS_FULL <=", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullLike(String value) {
            addCriterion("IS_FULL like", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotLike(String value) {
            addCriterion("IS_FULL not like", value, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullIn(List<String> values) {
            addCriterion("IS_FULL in", values, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotIn(List<String> values) {
            addCriterion("IS_FULL not in", values, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullBetween(String value1, String value2) {
            addCriterion("IS_FULL between", value1, value2, "isFull");
            return (Criteria) this;
        }

        public Criteria andIsFullNotBetween(String value1, String value2) {
            addCriterion("IS_FULL not between", value1, value2, "isFull");
            return (Criteria) this;
        }

        public Criteria andVipGradNameIsNull() {
            addCriterion("VIP_GRAD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVipGradNameIsNotNull() {
            addCriterion("VIP_GRAD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVipGradNameEqualTo(String value) {
            addCriterion("VIP_GRAD_NAME =", value, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andVipGradNameNotEqualTo(String value) {
            addCriterion("VIP_GRAD_NAME <>", value, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andVipGradNameGreaterThan(String value) {
            addCriterion("VIP_GRAD_NAME >", value, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andVipGradNameGreaterThanOrEqualTo(String value) {
            addCriterion("VIP_GRAD_NAME >=", value, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andVipGradNameLessThan(String value) {
            addCriterion("VIP_GRAD_NAME <", value, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andVipGradNameLessThanOrEqualTo(String value) {
            addCriterion("VIP_GRAD_NAME <=", value, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andVipGradNameLike(String value) {
            addCriterion("VIP_GRAD_NAME like", value, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andVipGradNameNotLike(String value) {
            addCriterion("VIP_GRAD_NAME not like", value, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andVipGradNameIn(List<String> values) {
            addCriterion("VIP_GRAD_NAME in", values, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andVipGradNameNotIn(List<String> values) {
            addCriterion("VIP_GRAD_NAME not in", values, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andVipGradNameBetween(String value1, String value2) {
            addCriterion("VIP_GRAD_NAME between", value1, value2, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andVipGradNameNotBetween(String value1, String value2) {
            addCriterion("VIP_GRAD_NAME not between", value1, value2, "vipGradName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNull() {
            addCriterion("CHANNEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andChannelNameIsNotNull() {
            addCriterion("CHANNEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andChannelNameEqualTo(String value) {
            addCriterion("CHANNEL_NAME =", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotEqualTo(String value) {
            addCriterion("CHANNEL_NAME <>", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThan(String value) {
            addCriterion("CHANNEL_NAME >", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME >=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThan(String value) {
            addCriterion("CHANNEL_NAME <", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_NAME <=", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameLike(String value) {
            addCriterion("CHANNEL_NAME like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotLike(String value) {
            addCriterion("CHANNEL_NAME not like", value, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameIn(List<String> values) {
            addCriterion("CHANNEL_NAME in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotIn(List<String> values) {
            addCriterion("CHANNEL_NAME not in", values, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelNameNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_NAME not between", value1, value2, "channelName");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("CHANNEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("CHANNEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(String value) {
            addCriterion("CHANNEL_ID =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(String value) {
            addCriterion("CHANNEL_ID <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(String value) {
            addCriterion("CHANNEL_ID >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(String value) {
            addCriterion("CHANNEL_ID <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(String value) {
            addCriterion("CHANNEL_ID <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLike(String value) {
            addCriterion("CHANNEL_ID like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotLike(String value) {
            addCriterion("CHANNEL_ID not like", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<String> values) {
            addCriterion("CHANNEL_ID in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<String> values) {
            addCriterion("CHANNEL_ID not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(String value1, String value2) {
            addCriterion("CHANNEL_ID not between", value1, value2, "channelId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}