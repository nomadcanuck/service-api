/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq;


import com.epam.ta.reportportal.store.jooq.tables.JBugTrackingSystem;
import com.epam.ta.reportportal.store.jooq.tables.JBugTrackingSystemAuth;
import com.epam.ta.reportportal.store.jooq.tables.JDashboard;
import com.epam.ta.reportportal.store.jooq.tables.JDashboardWidget;
import com.epam.ta.reportportal.store.jooq.tables.JDefectFieldAllowedValue;
import com.epam.ta.reportportal.store.jooq.tables.JDefectFormField;
import com.epam.ta.reportportal.store.jooq.tables.JIssue;
import com.epam.ta.reportportal.store.jooq.tables.JIssueTicket;
import com.epam.ta.reportportal.store.jooq.tables.JIssueType;
import com.epam.ta.reportportal.store.jooq.tables.JIssueTypeProjectConfiguration;
import com.epam.ta.reportportal.store.jooq.tables.JItemTag;
import com.epam.ta.reportportal.store.jooq.tables.JLaunch;
import com.epam.ta.reportportal.store.jooq.tables.JLaunchTag;
import com.epam.ta.reportportal.store.jooq.tables.JLog;
import com.epam.ta.reportportal.store.jooq.tables.JOauthAccessToken;
import com.epam.ta.reportportal.store.jooq.tables.JOauthRegistration;
import com.epam.ta.reportportal.store.jooq.tables.JOauthRegistrationScope;
import com.epam.ta.reportportal.store.jooq.tables.JProject;
import com.epam.ta.reportportal.store.jooq.tables.JProjectConfiguration;
import com.epam.ta.reportportal.store.jooq.tables.JProjectEmailConfiguration;
import com.epam.ta.reportportal.store.jooq.tables.JProjectUser;
import com.epam.ta.reportportal.store.jooq.tables.JServerSettings;
import com.epam.ta.reportportal.store.jooq.tables.JTestItem;
import com.epam.ta.reportportal.store.jooq.tables.JTestItemResults;
import com.epam.ta.reportportal.store.jooq.tables.JTestItemStructure;
import com.epam.ta.reportportal.store.jooq.tables.JTicket;
import com.epam.ta.reportportal.store.jooq.tables.JUsers;
import com.epam.ta.reportportal.store.jooq.tables.JWidget;
import com.epam.ta.reportportal.store.jooq.tables.records.JBugTrackingSystemAuthRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JBugTrackingSystemRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JDashboardRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JDashboardWidgetRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JDefectFieldAllowedValueRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JDefectFormFieldRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JIssueRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JIssueTicketRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JIssueTypeProjectConfigurationRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JIssueTypeRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JItemTagRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JLaunchRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JLaunchTagRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JLogRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JOauthAccessTokenRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JOauthRegistrationRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JOauthRegistrationScopeRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JProjectConfigurationRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JProjectEmailConfigurationRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JProjectRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JProjectUserRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JServerSettingsRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JTestItemRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JTestItemResultsRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JTestItemStructureRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JTicketRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JUsersRecord;
import com.epam.ta.reportportal.store.jooq.tables.records.JWidgetRecord;

import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>public</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<JBugTrackingSystemRecord, Integer> IDENTITY_BUG_TRACKING_SYSTEM = Identities0.IDENTITY_BUG_TRACKING_SYSTEM;
    public static final Identity<JBugTrackingSystemAuthRecord, Integer> IDENTITY_BUG_TRACKING_SYSTEM_AUTH = Identities0.IDENTITY_BUG_TRACKING_SYSTEM_AUTH;
    public static final Identity<JDashboardRecord, Integer> IDENTITY_DASHBOARD = Identities0.IDENTITY_DASHBOARD;
    public static final Identity<JDefectFieldAllowedValueRecord, Integer> IDENTITY_DEFECT_FIELD_ALLOWED_VALUE = Identities0.IDENTITY_DEFECT_FIELD_ALLOWED_VALUE;
    public static final Identity<JDefectFormFieldRecord, Integer> IDENTITY_DEFECT_FORM_FIELD = Identities0.IDENTITY_DEFECT_FORM_FIELD;
    public static final Identity<JIssueTypeRecord, Integer> IDENTITY_ISSUE_TYPE = Identities0.IDENTITY_ISSUE_TYPE;
    public static final Identity<JItemTagRecord, Integer> IDENTITY_ITEM_TAG = Identities0.IDENTITY_ITEM_TAG;
    public static final Identity<JLaunchRecord, Long> IDENTITY_LAUNCH = Identities0.IDENTITY_LAUNCH;
    public static final Identity<JLaunchTagRecord, Long> IDENTITY_LAUNCH_TAG = Identities0.IDENTITY_LAUNCH_TAG;
    public static final Identity<JLogRecord, Long> IDENTITY_LOG = Identities0.IDENTITY_LOG;
    public static final Identity<JOauthRegistrationScopeRecord, Integer> IDENTITY_OAUTH_REGISTRATION_SCOPE = Identities0.IDENTITY_OAUTH_REGISTRATION_SCOPE;
    public static final Identity<JProjectRecord, Long> IDENTITY_PROJECT = Identities0.IDENTITY_PROJECT;
    public static final Identity<JProjectEmailConfigurationRecord, Long> IDENTITY_PROJECT_EMAIL_CONFIGURATION = Identities0.IDENTITY_PROJECT_EMAIL_CONFIGURATION;
    public static final Identity<JServerSettingsRecord, Short> IDENTITY_SERVER_SETTINGS = Identities0.IDENTITY_SERVER_SETTINGS;
    public static final Identity<JTestItemRecord, Long> IDENTITY_TEST_ITEM = Identities0.IDENTITY_TEST_ITEM;
    public static final Identity<JTicketRecord, Long> IDENTITY_TICKET = Identities0.IDENTITY_TICKET;
    public static final Identity<JUsersRecord, Long> IDENTITY_USERS = Identities0.IDENTITY_USERS;
    public static final Identity<JWidgetRecord, Integer> IDENTITY_WIDGET = Identities0.IDENTITY_WIDGET;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<JBugTrackingSystemRecord> BUG_TRACKING_SYSTEM_PK = UniqueKeys0.BUG_TRACKING_SYSTEM_PK;
    public static final UniqueKey<JBugTrackingSystemAuthRecord> BUG_TRACKING_SYSTEM_AUTH_PK = UniqueKeys0.BUG_TRACKING_SYSTEM_AUTH_PK;
    public static final UniqueKey<JDashboardRecord> DASHBOARD_PK = UniqueKeys0.DASHBOARD_PK;
    public static final UniqueKey<JDashboardRecord> UNQ_NAME_PROJECT = UniqueKeys0.UNQ_NAME_PROJECT;
    public static final UniqueKey<JDashboardWidgetRecord> DASHBOARD_WIDGET_PK = UniqueKeys0.DASHBOARD_WIDGET_PK;
    public static final UniqueKey<JDashboardWidgetRecord> WIDGET_ON_DASHBOARD_UNQ = UniqueKeys0.WIDGET_ON_DASHBOARD_UNQ;
    public static final UniqueKey<JDefectFieldAllowedValueRecord> DEFECT_FIELD_ALLOWED_VALUE_PK = UniqueKeys0.DEFECT_FIELD_ALLOWED_VALUE_PK;
    public static final UniqueKey<JDefectFormFieldRecord> DEFECT_FORM_FIELD_PK = UniqueKeys0.DEFECT_FORM_FIELD_PK;
    public static final UniqueKey<JIssueRecord> ISSUE_PK = UniqueKeys0.ISSUE_PK;
    public static final UniqueKey<JIssueTicketRecord> ISSUE_TICKET_PK = UniqueKeys0.ISSUE_TICKET_PK;
    public static final UniqueKey<JIssueTypeRecord> ISSUE_TYPE_PK = UniqueKeys0.ISSUE_TYPE_PK;
    public static final UniqueKey<JIssueTypeProjectConfigurationRecord> ISSUE_TYPE_PROJECT_CONFIGURATION_PK = UniqueKeys0.ISSUE_TYPE_PROJECT_CONFIGURATION_PK;
    public static final UniqueKey<JItemTagRecord> ITEM_TAG_PK = UniqueKeys0.ITEM_TAG_PK;
    public static final UniqueKey<JLaunchRecord> LAUNCH_PK = UniqueKeys0.LAUNCH_PK;
    public static final UniqueKey<JLaunchRecord> UNQ_NAME_NUMBER = UniqueKeys0.UNQ_NAME_NUMBER;
    public static final UniqueKey<JLaunchTagRecord> LAUNCH_TAG_PK = UniqueKeys0.LAUNCH_TAG_PK;
    public static final UniqueKey<JLogRecord> LOG_PK = UniqueKeys0.LOG_PK;
    public static final UniqueKey<JOauthAccessTokenRecord> ACCESS_TOKENS_PK = UniqueKeys0.ACCESS_TOKENS_PK;
    public static final UniqueKey<JOauthRegistrationRecord> OAUTH_REGISTRATION_PKEY = UniqueKeys0.OAUTH_REGISTRATION_PKEY;
    public static final UniqueKey<JOauthRegistrationRecord> OAUTH_REGISTRATION_CLIENT_ID_KEY = UniqueKeys0.OAUTH_REGISTRATION_CLIENT_ID_KEY;
    public static final UniqueKey<JOauthRegistrationScopeRecord> OAUTH_REGISTRATION_SCOPE_PK = UniqueKeys0.OAUTH_REGISTRATION_SCOPE_PK;
    public static final UniqueKey<JProjectRecord> PROJECT_PK = UniqueKeys0.PROJECT_PK;
    public static final UniqueKey<JProjectConfigurationRecord> PROJECT_CONFIGURATION_PK = UniqueKeys0.PROJECT_CONFIGURATION_PK;
    public static final UniqueKey<JProjectConfigurationRecord> PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_KEY = UniqueKeys0.PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_KEY;
    public static final UniqueKey<JProjectEmailConfigurationRecord> PROJECT_EMAIL_CONFIGURATION_PK = UniqueKeys0.PROJECT_EMAIL_CONFIGURATION_PK;
    public static final UniqueKey<JProjectUserRecord> USERS_PROJECT_PK = UniqueKeys0.USERS_PROJECT_PK;
    public static final UniqueKey<JServerSettingsRecord> SERVER_SETTINGS_ID = UniqueKeys0.SERVER_SETTINGS_ID;
    public static final UniqueKey<JTestItemRecord> TEST_ITEM_PK = UniqueKeys0.TEST_ITEM_PK;
    public static final UniqueKey<JTestItemResultsRecord> TEST_ITEM_RESULTS_PK = UniqueKeys0.TEST_ITEM_RESULTS_PK;
    public static final UniqueKey<JTestItemStructureRecord> TEST_ITEM_STRUCTURE_PK = UniqueKeys0.TEST_ITEM_STRUCTURE_PK;
    public static final UniqueKey<JTicketRecord> TICKET_PK = UniqueKeys0.TICKET_PK;
    public static final UniqueKey<JTicketRecord> TICKET_TICKET_ID_KEY = UniqueKeys0.TICKET_TICKET_ID_KEY;
    public static final UniqueKey<JUsersRecord> USERS_PK = UniqueKeys0.USERS_PK;
    public static final UniqueKey<JUsersRecord> USERS_LOGIN_KEY = UniqueKeys0.USERS_LOGIN_KEY;
    public static final UniqueKey<JWidgetRecord> WIDGET_ID = UniqueKeys0.WIDGET_ID;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<JBugTrackingSystemRecord, JProjectRecord> BUG_TRACKING_SYSTEM__BUG_TRACKING_SYSTEM_PROJECT_ID_FKEY = ForeignKeys0.BUG_TRACKING_SYSTEM__BUG_TRACKING_SYSTEM_PROJECT_ID_FKEY;
    public static final ForeignKey<JBugTrackingSystemAuthRecord, JBugTrackingSystemRecord> BUG_TRACKING_SYSTEM_AUTH__BUG_TRACKING_SYSTEM_AUTH_ID_FKEY = ForeignKeys0.BUG_TRACKING_SYSTEM_AUTH__BUG_TRACKING_SYSTEM_AUTH_ID_FKEY;
    public static final ForeignKey<JDashboardRecord, JProjectRecord> DASHBOARD__DASHBOARD_PROJECT_ID_FKEY = ForeignKeys0.DASHBOARD__DASHBOARD_PROJECT_ID_FKEY;
    public static final ForeignKey<JDashboardWidgetRecord, JDashboardRecord> DASHBOARD_WIDGET__DASHBOARD_WIDGET_DASHBOARD_ID_FKEY = ForeignKeys0.DASHBOARD_WIDGET__DASHBOARD_WIDGET_DASHBOARD_ID_FKEY;
    public static final ForeignKey<JDashboardWidgetRecord, JWidgetRecord> DASHBOARD_WIDGET__DASHBOARD_WIDGET_WIDGET_ID_FKEY = ForeignKeys0.DASHBOARD_WIDGET__DASHBOARD_WIDGET_WIDGET_ID_FKEY;
    public static final ForeignKey<JDefectFieldAllowedValueRecord, JDefectFormFieldRecord> DEFECT_FIELD_ALLOWED_VALUE__DEFECT_FIELD_ALLOWED_VALUE_DEFECT_FORM_FIELD_FKEY = ForeignKeys0.DEFECT_FIELD_ALLOWED_VALUE__DEFECT_FIELD_ALLOWED_VALUE_DEFECT_FORM_FIELD_FKEY;
    public static final ForeignKey<JDefectFormFieldRecord, JBugTrackingSystemRecord> DEFECT_FORM_FIELD__DEFECT_FORM_FIELD_BUGTRACKING_SYSTEM_FKEY = ForeignKeys0.DEFECT_FORM_FIELD__DEFECT_FORM_FIELD_BUGTRACKING_SYSTEM_FKEY;
    public static final ForeignKey<JIssueRecord, JTestItemResultsRecord> ISSUE__ISSUE_ISSUE_ID_FKEY = ForeignKeys0.ISSUE__ISSUE_ISSUE_ID_FKEY;
    public static final ForeignKey<JIssueRecord, JIssueTypeRecord> ISSUE__ISSUE_ISSUE_TYPE_FKEY = ForeignKeys0.ISSUE__ISSUE_ISSUE_TYPE_FKEY;
    public static final ForeignKey<JIssueTicketRecord, JIssueRecord> ISSUE_TICKET__ISSUE_TICKET_ISSUE_ID_FKEY = ForeignKeys0.ISSUE_TICKET__ISSUE_TICKET_ISSUE_ID_FKEY;
    public static final ForeignKey<JIssueTicketRecord, JTicketRecord> ISSUE_TICKET__ISSUE_TICKET_TICKET_ID_FKEY = ForeignKeys0.ISSUE_TICKET__ISSUE_TICKET_TICKET_ID_FKEY;
    public static final ForeignKey<JIssueTypeProjectConfigurationRecord, JProjectConfigurationRecord> ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_CONFIGURATION_ID_FKEY = ForeignKeys0.ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_CONFIGURATION_ID_FKEY;
    public static final ForeignKey<JIssueTypeProjectConfigurationRecord, JIssueTypeRecord> ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_ISSUE_TYPE_ID_FKEY = ForeignKeys0.ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_ISSUE_TYPE_ID_FKEY;
    public static final ForeignKey<JItemTagRecord, JTestItemRecord> ITEM_TAG__ITEM_TAG_ITEM_ID_FKEY = ForeignKeys0.ITEM_TAG__ITEM_TAG_ITEM_ID_FKEY;
    public static final ForeignKey<JLaunchRecord, JProjectRecord> LAUNCH__LAUNCH_PROJECT_ID_FKEY = ForeignKeys0.LAUNCH__LAUNCH_PROJECT_ID_FKEY;
    public static final ForeignKey<JLaunchRecord, JUsersRecord> LAUNCH__LAUNCH_USER_ID_FKEY = ForeignKeys0.LAUNCH__LAUNCH_USER_ID_FKEY;
    public static final ForeignKey<JLaunchTagRecord, JLaunchRecord> LAUNCH_TAG__LAUNCH_TAG_LAUNCH_ID_FKEY = ForeignKeys0.LAUNCH_TAG__LAUNCH_TAG_LAUNCH_ID_FKEY;
    public static final ForeignKey<JLogRecord, JTestItemRecord> LOG__LOG_ITEM_ID_FKEY = ForeignKeys0.LOG__LOG_ITEM_ID_FKEY;
    public static final ForeignKey<JOauthAccessTokenRecord, JUsersRecord> OAUTH_ACCESS_TOKEN__OAUTH_ACCESS_TOKEN_USER_ID_FKEY = ForeignKeys0.OAUTH_ACCESS_TOKEN__OAUTH_ACCESS_TOKEN_USER_ID_FKEY;
    public static final ForeignKey<JOauthRegistrationScopeRecord, JOauthRegistrationRecord> OAUTH_REGISTRATION_SCOPE__OAUTH_REGISTRATION_SCOPE_OAUTH_REGISTRATION_FK_FKEY = ForeignKeys0.OAUTH_REGISTRATION_SCOPE__OAUTH_REGISTRATION_SCOPE_OAUTH_REGISTRATION_FK_FKEY;
    public static final ForeignKey<JProjectConfigurationRecord, JProjectRecord> PROJECT_CONFIGURATION__PROJECT_CONFIGURATION_ID_FKEY = ForeignKeys0.PROJECT_CONFIGURATION__PROJECT_CONFIGURATION_ID_FKEY;
    public static final ForeignKey<JProjectConfigurationRecord, JProjectEmailConfigurationRecord> PROJECT_CONFIGURATION__PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_FKEY = ForeignKeys0.PROJECT_CONFIGURATION__PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_FKEY;
    public static final ForeignKey<JProjectUserRecord, JUsersRecord> PROJECT_USER__PROJECT_USER_USER_ID_FKEY = ForeignKeys0.PROJECT_USER__PROJECT_USER_USER_ID_FKEY;
    public static final ForeignKey<JProjectUserRecord, JProjectRecord> PROJECT_USER__PROJECT_USER_PROJECT_ID_FKEY = ForeignKeys0.PROJECT_USER__PROJECT_USER_PROJECT_ID_FKEY;
    public static final ForeignKey<JTestItemRecord, JLaunchRecord> TEST_ITEM__TEST_ITEM_LAUNCH_ID_FKEY = ForeignKeys0.TEST_ITEM__TEST_ITEM_LAUNCH_ID_FKEY;
    public static final ForeignKey<JTestItemResultsRecord, JTestItemRecord> TEST_ITEM_RESULTS__TEST_ITEM_RESULTS_ITEM_ID_FKEY = ForeignKeys0.TEST_ITEM_RESULTS__TEST_ITEM_RESULTS_ITEM_ID_FKEY;
    public static final ForeignKey<JTestItemStructureRecord, JTestItemRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_ITEM_ID_FKEY = ForeignKeys0.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_ITEM_ID_FKEY;
    public static final ForeignKey<JTestItemStructureRecord, JTestItemStructureRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_PARENT_ID_FKEY = ForeignKeys0.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_PARENT_ID_FKEY;
    public static final ForeignKey<JTestItemStructureRecord, JTestItemStructureRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_RETRY_OF_FKEY = ForeignKeys0.TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_RETRY_OF_FKEY;
    public static final ForeignKey<JTicketRecord, JUsersRecord> TICKET__TICKET_SUBMITTER_ID_FKEY = ForeignKeys0.TICKET__TICKET_SUBMITTER_ID_FKEY;
    public static final ForeignKey<JTicketRecord, JBugTrackingSystemRecord> TICKET__TICKET_BTS_ID_FKEY = ForeignKeys0.TICKET__TICKET_BTS_ID_FKEY;
    public static final ForeignKey<JUsersRecord, JProjectRecord> USERS__USERS_DEFAULT_PROJECT_ID_FKEY = ForeignKeys0.USERS__USERS_DEFAULT_PROJECT_ID_FKEY;
    public static final ForeignKey<JWidgetRecord, JProjectRecord> WIDGET__WIDGET_PROJECT_ID_FKEY = ForeignKeys0.WIDGET__WIDGET_PROJECT_ID_FKEY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 {
        public static Identity<JBugTrackingSystemRecord, Integer> IDENTITY_BUG_TRACKING_SYSTEM = Internal.createIdentity(JBugTrackingSystem.BUG_TRACKING_SYSTEM, JBugTrackingSystem.BUG_TRACKING_SYSTEM.ID);
        public static Identity<JBugTrackingSystemAuthRecord, Integer> IDENTITY_BUG_TRACKING_SYSTEM_AUTH = Internal.createIdentity(JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH, JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH.ID);
        public static Identity<JDashboardRecord, Integer> IDENTITY_DASHBOARD = Internal.createIdentity(JDashboard.DASHBOARD, JDashboard.DASHBOARD.ID);
        public static Identity<JDefectFieldAllowedValueRecord, Integer> IDENTITY_DEFECT_FIELD_ALLOWED_VALUE = Internal.createIdentity(JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE, JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE.ID);
        public static Identity<JDefectFormFieldRecord, Integer> IDENTITY_DEFECT_FORM_FIELD = Internal.createIdentity(JDefectFormField.DEFECT_FORM_FIELD, JDefectFormField.DEFECT_FORM_FIELD.ID);
        public static Identity<JIssueTypeRecord, Integer> IDENTITY_ISSUE_TYPE = Internal.createIdentity(JIssueType.ISSUE_TYPE, JIssueType.ISSUE_TYPE.ID);
        public static Identity<JItemTagRecord, Integer> IDENTITY_ITEM_TAG = Internal.createIdentity(JItemTag.ITEM_TAG, JItemTag.ITEM_TAG.ID);
        public static Identity<JLaunchRecord, Long> IDENTITY_LAUNCH = Internal.createIdentity(JLaunch.LAUNCH, JLaunch.LAUNCH.ID);
        public static Identity<JLaunchTagRecord, Long> IDENTITY_LAUNCH_TAG = Internal.createIdentity(JLaunchTag.LAUNCH_TAG, JLaunchTag.LAUNCH_TAG.ID);
        public static Identity<JLogRecord, Long> IDENTITY_LOG = Internal.createIdentity(JLog.LOG, JLog.LOG.ID);
        public static Identity<JOauthRegistrationScopeRecord, Integer> IDENTITY_OAUTH_REGISTRATION_SCOPE = Internal.createIdentity(JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE, JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.ID);
        public static Identity<JProjectRecord, Long> IDENTITY_PROJECT = Internal.createIdentity(JProject.PROJECT, JProject.PROJECT.ID);
        public static Identity<JProjectEmailConfigurationRecord, Long> IDENTITY_PROJECT_EMAIL_CONFIGURATION = Internal.createIdentity(JProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION, JProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION.ID);
        public static Identity<JServerSettingsRecord, Short> IDENTITY_SERVER_SETTINGS = Internal.createIdentity(JServerSettings.SERVER_SETTINGS, JServerSettings.SERVER_SETTINGS.ID);
        public static Identity<JTestItemRecord, Long> IDENTITY_TEST_ITEM = Internal.createIdentity(JTestItem.TEST_ITEM, JTestItem.TEST_ITEM.ITEM_ID);
        public static Identity<JTicketRecord, Long> IDENTITY_TICKET = Internal.createIdentity(JTicket.TICKET, JTicket.TICKET.ID);
        public static Identity<JUsersRecord, Long> IDENTITY_USERS = Internal.createIdentity(JUsers.USERS, JUsers.USERS.ID);
        public static Identity<JWidgetRecord, Integer> IDENTITY_WIDGET = Internal.createIdentity(JWidget.WIDGET, JWidget.WIDGET.ID);
    }

    private static class UniqueKeys0 {
        public static final UniqueKey<JBugTrackingSystemRecord> BUG_TRACKING_SYSTEM_PK = Internal.createUniqueKey(JBugTrackingSystem.BUG_TRACKING_SYSTEM, "bug_tracking_system_pk", JBugTrackingSystem.BUG_TRACKING_SYSTEM.ID);
        public static final UniqueKey<JBugTrackingSystemAuthRecord> BUG_TRACKING_SYSTEM_AUTH_PK = Internal.createUniqueKey(JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH, "bug_tracking_system_auth_pk", JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH.ID);
        public static final UniqueKey<JDashboardRecord> DASHBOARD_PK = Internal.createUniqueKey(JDashboard.DASHBOARD, "dashboard_pk", JDashboard.DASHBOARD.ID);
        public static final UniqueKey<JDashboardRecord> UNQ_NAME_PROJECT = Internal.createUniqueKey(JDashboard.DASHBOARD, "unq_name_project", JDashboard.DASHBOARD.NAME, JDashboard.DASHBOARD.PROJECT_ID);
        public static final UniqueKey<JDashboardWidgetRecord> DASHBOARD_WIDGET_PK = Internal.createUniqueKey(JDashboardWidget.DASHBOARD_WIDGET, "dashboard_widget_pk", JDashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID, JDashboardWidget.DASHBOARD_WIDGET.WIDGET_ID);
        public static final UniqueKey<JDashboardWidgetRecord> WIDGET_ON_DASHBOARD_UNQ = Internal.createUniqueKey(JDashboardWidget.DASHBOARD_WIDGET, "widget_on_dashboard_unq", JDashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID, JDashboardWidget.DASHBOARD_WIDGET.WIDGET_NAME);
        public static final UniqueKey<JDefectFieldAllowedValueRecord> DEFECT_FIELD_ALLOWED_VALUE_PK = Internal.createUniqueKey(JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE, "defect_field_allowed_value_pk", JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE.ID);
        public static final UniqueKey<JDefectFormFieldRecord> DEFECT_FORM_FIELD_PK = Internal.createUniqueKey(JDefectFormField.DEFECT_FORM_FIELD, "defect_form_field_pk", JDefectFormField.DEFECT_FORM_FIELD.ID);
        public static final UniqueKey<JIssueRecord> ISSUE_PK = Internal.createUniqueKey(JIssue.ISSUE, "issue_pk", JIssue.ISSUE.ISSUE_ID);
        public static final UniqueKey<JIssueTicketRecord> ISSUE_TICKET_PK = Internal.createUniqueKey(JIssueTicket.ISSUE_TICKET, "issue_ticket_pk", JIssueTicket.ISSUE_TICKET.ISSUE_ID, JIssueTicket.ISSUE_TICKET.TICKET_ID);
        public static final UniqueKey<JIssueTypeRecord> ISSUE_TYPE_PK = Internal.createUniqueKey(JIssueType.ISSUE_TYPE, "issue_type_pk", JIssueType.ISSUE_TYPE.ID);
        public static final UniqueKey<JIssueTypeProjectConfigurationRecord> ISSUE_TYPE_PROJECT_CONFIGURATION_PK = Internal.createUniqueKey(JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION, "issue_type_project_configuration_pk", JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.CONFIGURATION_ID, JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.ISSUE_TYPE_ID);
        public static final UniqueKey<JItemTagRecord> ITEM_TAG_PK = Internal.createUniqueKey(JItemTag.ITEM_TAG, "item_tag_pk", JItemTag.ITEM_TAG.ID);
        public static final UniqueKey<JLaunchRecord> LAUNCH_PK = Internal.createUniqueKey(JLaunch.LAUNCH, "launch_pk", JLaunch.LAUNCH.ID);
        public static final UniqueKey<JLaunchRecord> UNQ_NAME_NUMBER = Internal.createUniqueKey(JLaunch.LAUNCH, "unq_name_number", JLaunch.LAUNCH.NAME, JLaunch.LAUNCH.NUMBER, JLaunch.LAUNCH.PROJECT_ID);
        public static final UniqueKey<JLaunchTagRecord> LAUNCH_TAG_PK = Internal.createUniqueKey(JLaunchTag.LAUNCH_TAG, "launch_tag_pk", JLaunchTag.LAUNCH_TAG.ID);
        public static final UniqueKey<JLogRecord> LOG_PK = Internal.createUniqueKey(JLog.LOG, "log_pk", JLog.LOG.ID);
        public static final UniqueKey<JOauthAccessTokenRecord> ACCESS_TOKENS_PK = Internal.createUniqueKey(JOauthAccessToken.OAUTH_ACCESS_TOKEN, "access_tokens_pk", JOauthAccessToken.OAUTH_ACCESS_TOKEN.USER_ID, JOauthAccessToken.OAUTH_ACCESS_TOKEN.TOKEN_TYPE);
        public static final UniqueKey<JOauthRegistrationRecord> OAUTH_REGISTRATION_PKEY = Internal.createUniqueKey(JOauthRegistration.OAUTH_REGISTRATION, "oauth_registration_pkey", JOauthRegistration.OAUTH_REGISTRATION.ID);
        public static final UniqueKey<JOauthRegistrationRecord> OAUTH_REGISTRATION_CLIENT_ID_KEY = Internal.createUniqueKey(JOauthRegistration.OAUTH_REGISTRATION, "oauth_registration_client_id_key", JOauthRegistration.OAUTH_REGISTRATION.CLIENT_ID);
        public static final UniqueKey<JOauthRegistrationScopeRecord> OAUTH_REGISTRATION_SCOPE_PK = Internal.createUniqueKey(JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE, "oauth_registration_scope_pk", JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.ID);
        public static final UniqueKey<JProjectRecord> PROJECT_PK = Internal.createUniqueKey(JProject.PROJECT, "project_pk", JProject.PROJECT.ID);
        public static final UniqueKey<JProjectConfigurationRecord> PROJECT_CONFIGURATION_PK = Internal.createUniqueKey(JProjectConfiguration.PROJECT_CONFIGURATION, "project_configuration_pk", JProjectConfiguration.PROJECT_CONFIGURATION.ID);
        public static final UniqueKey<JProjectConfigurationRecord> PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_KEY = Internal.createUniqueKey(JProjectConfiguration.PROJECT_CONFIGURATION, "project_configuration_email_configuration_id_key", JProjectConfiguration.PROJECT_CONFIGURATION.EMAIL_CONFIGURATION_ID);
        public static final UniqueKey<JProjectEmailConfigurationRecord> PROJECT_EMAIL_CONFIGURATION_PK = Internal.createUniqueKey(JProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION, "project_email_configuration_pk", JProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION.ID);
        public static final UniqueKey<JProjectUserRecord> USERS_PROJECT_PK = Internal.createUniqueKey(JProjectUser.PROJECT_USER, "users_project_pk", JProjectUser.PROJECT_USER.USER_ID, JProjectUser.PROJECT_USER.PROJECT_ID);
        public static final UniqueKey<JServerSettingsRecord> SERVER_SETTINGS_ID = Internal.createUniqueKey(JServerSettings.SERVER_SETTINGS, "server_settings_id", JServerSettings.SERVER_SETTINGS.ID);
        public static final UniqueKey<JTestItemRecord> TEST_ITEM_PK = Internal.createUniqueKey(JTestItem.TEST_ITEM, "test_item_pk", JTestItem.TEST_ITEM.ITEM_ID);
        public static final UniqueKey<JTestItemResultsRecord> TEST_ITEM_RESULTS_PK = Internal.createUniqueKey(JTestItemResults.TEST_ITEM_RESULTS, "test_item_results_pk", JTestItemResults.TEST_ITEM_RESULTS.ITEM_ID);
        public static final UniqueKey<JTestItemStructureRecord> TEST_ITEM_STRUCTURE_PK = Internal.createUniqueKey(JTestItemStructure.TEST_ITEM_STRUCTURE, "test_item_structure_pk", JTestItemStructure.TEST_ITEM_STRUCTURE.ITEM_ID);
        public static final UniqueKey<JTicketRecord> TICKET_PK = Internal.createUniqueKey(JTicket.TICKET, "ticket_pk", JTicket.TICKET.ID);
        public static final UniqueKey<JTicketRecord> TICKET_TICKET_ID_KEY = Internal.createUniqueKey(JTicket.TICKET, "ticket_ticket_id_key", JTicket.TICKET.TICKET_ID);
        public static final UniqueKey<JUsersRecord> USERS_PK = Internal.createUniqueKey(JUsers.USERS, "users_pk", JUsers.USERS.ID);
        public static final UniqueKey<JUsersRecord> USERS_LOGIN_KEY = Internal.createUniqueKey(JUsers.USERS, "users_login_key", JUsers.USERS.LOGIN);
        public static final UniqueKey<JWidgetRecord> WIDGET_ID = Internal.createUniqueKey(JWidget.WIDGET, "widget_id", JWidget.WIDGET.ID);
    }

    private static class ForeignKeys0 {
        public static final ForeignKey<JBugTrackingSystemRecord, JProjectRecord> BUG_TRACKING_SYSTEM__BUG_TRACKING_SYSTEM_PROJECT_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.PROJECT_PK, JBugTrackingSystem.BUG_TRACKING_SYSTEM, "bug_tracking_system__bug_tracking_system_project_id_fkey", JBugTrackingSystem.BUG_TRACKING_SYSTEM.PROJECT_ID);
        public static final ForeignKey<JBugTrackingSystemAuthRecord, JBugTrackingSystemRecord> BUG_TRACKING_SYSTEM_AUTH__BUG_TRACKING_SYSTEM_AUTH_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.BUG_TRACKING_SYSTEM_PK, JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH, "bug_tracking_system_auth__bug_tracking_system_auth_id_fkey", JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH.ID);
        public static final ForeignKey<JDashboardRecord, JProjectRecord> DASHBOARD__DASHBOARD_PROJECT_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.PROJECT_PK, JDashboard.DASHBOARD, "dashboard__dashboard_project_id_fkey", JDashboard.DASHBOARD.PROJECT_ID);
        public static final ForeignKey<JDashboardWidgetRecord, JDashboardRecord> DASHBOARD_WIDGET__DASHBOARD_WIDGET_DASHBOARD_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.DASHBOARD_PK, JDashboardWidget.DASHBOARD_WIDGET, "dashboard_widget__dashboard_widget_dashboard_id_fkey", JDashboardWidget.DASHBOARD_WIDGET.DASHBOARD_ID);
        public static final ForeignKey<JDashboardWidgetRecord, JWidgetRecord> DASHBOARD_WIDGET__DASHBOARD_WIDGET_WIDGET_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.WIDGET_ID, JDashboardWidget.DASHBOARD_WIDGET, "dashboard_widget__dashboard_widget_widget_id_fkey", JDashboardWidget.DASHBOARD_WIDGET.WIDGET_ID);
        public static final ForeignKey<JDefectFieldAllowedValueRecord, JDefectFormFieldRecord> DEFECT_FIELD_ALLOWED_VALUE__DEFECT_FIELD_ALLOWED_VALUE_DEFECT_FORM_FIELD_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.DEFECT_FORM_FIELD_PK, JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE, "defect_field_allowed_value__defect_field_allowed_value_defect_form_field_fkey", JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE.DEFECT_FORM_FIELD);
        public static final ForeignKey<JDefectFormFieldRecord, JBugTrackingSystemRecord> DEFECT_FORM_FIELD__DEFECT_FORM_FIELD_BUGTRACKING_SYSTEM_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.BUG_TRACKING_SYSTEM_PK, JDefectFormField.DEFECT_FORM_FIELD, "defect_form_field__defect_form_field_bugtracking_system_fkey", JDefectFormField.DEFECT_FORM_FIELD.BUGTRACKING_SYSTEM);
        public static final ForeignKey<JIssueRecord, JTestItemResultsRecord> ISSUE__ISSUE_ISSUE_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.TEST_ITEM_RESULTS_PK, JIssue.ISSUE, "issue__issue_issue_id_fkey", JIssue.ISSUE.ISSUE_ID);
        public static final ForeignKey<JIssueRecord, JIssueTypeRecord> ISSUE__ISSUE_ISSUE_TYPE_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.ISSUE_TYPE_PK, JIssue.ISSUE, "issue__issue_issue_type_fkey", JIssue.ISSUE.ISSUE_TYPE);
        public static final ForeignKey<JIssueTicketRecord, JIssueRecord> ISSUE_TICKET__ISSUE_TICKET_ISSUE_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.ISSUE_PK, JIssueTicket.ISSUE_TICKET, "issue_ticket__issue_ticket_issue_id_fkey", JIssueTicket.ISSUE_TICKET.ISSUE_ID);
        public static final ForeignKey<JIssueTicketRecord, JTicketRecord> ISSUE_TICKET__ISSUE_TICKET_TICKET_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.TICKET_PK, JIssueTicket.ISSUE_TICKET, "issue_ticket__issue_ticket_ticket_id_fkey", JIssueTicket.ISSUE_TICKET.TICKET_ID);
        public static final ForeignKey<JIssueTypeProjectConfigurationRecord, JProjectConfigurationRecord> ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_CONFIGURATION_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.PROJECT_CONFIGURATION_PK, JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION, "issue_type_project_configuration__issue_type_project_configuration_configuration_id_fkey", JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.CONFIGURATION_ID);
        public static final ForeignKey<JIssueTypeProjectConfigurationRecord, JIssueTypeRecord> ISSUE_TYPE_PROJECT_CONFIGURATION__ISSUE_TYPE_PROJECT_CONFIGURATION_ISSUE_TYPE_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.ISSUE_TYPE_PK, JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION, "issue_type_project_configuration__issue_type_project_configuration_issue_type_id_fkey", JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION.ISSUE_TYPE_ID);
        public static final ForeignKey<JItemTagRecord, JTestItemRecord> ITEM_TAG__ITEM_TAG_ITEM_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.TEST_ITEM_PK, JItemTag.ITEM_TAG, "item_tag__item_tag_item_id_fkey", JItemTag.ITEM_TAG.ITEM_ID);
        public static final ForeignKey<JLaunchRecord, JProjectRecord> LAUNCH__LAUNCH_PROJECT_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.PROJECT_PK, JLaunch.LAUNCH, "launch__launch_project_id_fkey", JLaunch.LAUNCH.PROJECT_ID);
        public static final ForeignKey<JLaunchRecord, JUsersRecord> LAUNCH__LAUNCH_USER_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.USERS_PK, JLaunch.LAUNCH, "launch__launch_user_id_fkey", JLaunch.LAUNCH.USER_ID);
        public static final ForeignKey<JLaunchTagRecord, JLaunchRecord> LAUNCH_TAG__LAUNCH_TAG_LAUNCH_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.LAUNCH_PK, JLaunchTag.LAUNCH_TAG, "launch_tag__launch_tag_launch_id_fkey", JLaunchTag.LAUNCH_TAG.LAUNCH_ID);
        public static final ForeignKey<JLogRecord, JTestItemRecord> LOG__LOG_ITEM_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.TEST_ITEM_PK, JLog.LOG, "log__log_item_id_fkey", JLog.LOG.ITEM_ID);
        public static final ForeignKey<JOauthAccessTokenRecord, JUsersRecord> OAUTH_ACCESS_TOKEN__OAUTH_ACCESS_TOKEN_USER_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.USERS_PK, JOauthAccessToken.OAUTH_ACCESS_TOKEN, "oauth_access_token__oauth_access_token_user_id_fkey", JOauthAccessToken.OAUTH_ACCESS_TOKEN.USER_ID);
        public static final ForeignKey<JOauthRegistrationScopeRecord, JOauthRegistrationRecord> OAUTH_REGISTRATION_SCOPE__OAUTH_REGISTRATION_SCOPE_OAUTH_REGISTRATION_FK_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.OAUTH_REGISTRATION_PKEY, JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE, "oauth_registration_scope__oauth_registration_scope_oauth_registration_fk_fkey", JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE.OAUTH_REGISTRATION_FK);
        public static final ForeignKey<JProjectConfigurationRecord, JProjectRecord> PROJECT_CONFIGURATION__PROJECT_CONFIGURATION_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.PROJECT_PK, JProjectConfiguration.PROJECT_CONFIGURATION, "project_configuration__project_configuration_id_fkey", JProjectConfiguration.PROJECT_CONFIGURATION.ID);
        public static final ForeignKey<JProjectConfigurationRecord, JProjectEmailConfigurationRecord> PROJECT_CONFIGURATION__PROJECT_CONFIGURATION_EMAIL_CONFIGURATION_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.PROJECT_EMAIL_CONFIGURATION_PK, JProjectConfiguration.PROJECT_CONFIGURATION, "project_configuration__project_configuration_email_configuration_id_fkey", JProjectConfiguration.PROJECT_CONFIGURATION.EMAIL_CONFIGURATION_ID);
        public static final ForeignKey<JProjectUserRecord, JUsersRecord> PROJECT_USER__PROJECT_USER_USER_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.USERS_PK, JProjectUser.PROJECT_USER, "project_user__project_user_user_id_fkey", JProjectUser.PROJECT_USER.USER_ID);
        public static final ForeignKey<JProjectUserRecord, JProjectRecord> PROJECT_USER__PROJECT_USER_PROJECT_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.PROJECT_PK, JProjectUser.PROJECT_USER, "project_user__project_user_project_id_fkey", JProjectUser.PROJECT_USER.PROJECT_ID);
        public static final ForeignKey<JTestItemRecord, JLaunchRecord> TEST_ITEM__TEST_ITEM_LAUNCH_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.LAUNCH_PK, JTestItem.TEST_ITEM, "test_item__test_item_launch_id_fkey", JTestItem.TEST_ITEM.LAUNCH_ID);
        public static final ForeignKey<JTestItemResultsRecord, JTestItemRecord> TEST_ITEM_RESULTS__TEST_ITEM_RESULTS_ITEM_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.TEST_ITEM_PK, JTestItemResults.TEST_ITEM_RESULTS, "test_item_results__test_item_results_item_id_fkey", JTestItemResults.TEST_ITEM_RESULTS.ITEM_ID);
        public static final ForeignKey<JTestItemStructureRecord, JTestItemRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_ITEM_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.TEST_ITEM_PK, JTestItemStructure.TEST_ITEM_STRUCTURE, "test_item_structure__test_item_structure_item_id_fkey", JTestItemStructure.TEST_ITEM_STRUCTURE.ITEM_ID);
        public static final ForeignKey<JTestItemStructureRecord, JTestItemStructureRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_PARENT_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.TEST_ITEM_STRUCTURE_PK, JTestItemStructure.TEST_ITEM_STRUCTURE, "test_item_structure__test_item_structure_parent_id_fkey", JTestItemStructure.TEST_ITEM_STRUCTURE.PARENT_ID);
        public static final ForeignKey<JTestItemStructureRecord, JTestItemStructureRecord> TEST_ITEM_STRUCTURE__TEST_ITEM_STRUCTURE_RETRY_OF_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.TEST_ITEM_STRUCTURE_PK, JTestItemStructure.TEST_ITEM_STRUCTURE, "test_item_structure__test_item_structure_retry_of_fkey", JTestItemStructure.TEST_ITEM_STRUCTURE.RETRY_OF);
        public static final ForeignKey<JTicketRecord, JUsersRecord> TICKET__TICKET_SUBMITTER_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.USERS_PK, JTicket.TICKET, "ticket__ticket_submitter_id_fkey", JTicket.TICKET.SUBMITTER_ID);
        public static final ForeignKey<JTicketRecord, JBugTrackingSystemRecord> TICKET__TICKET_BTS_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.BUG_TRACKING_SYSTEM_PK, JTicket.TICKET, "ticket__ticket_bts_id_fkey", JTicket.TICKET.BTS_ID);
        public static final ForeignKey<JUsersRecord, JProjectRecord> USERS__USERS_DEFAULT_PROJECT_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.PROJECT_PK, JUsers.USERS, "users__users_default_project_id_fkey", JUsers.USERS.DEFAULT_PROJECT_ID);
        public static final ForeignKey<JWidgetRecord, JProjectRecord> WIDGET__WIDGET_PROJECT_ID_FKEY = Internal.createForeignKey(com.epam.ta.reportportal.store.jooq.Keys.PROJECT_PK, JWidget.WIDGET, "widget__widget_project_id_fkey", JWidget.WIDGET.PROJECT_ID);
    }
}
