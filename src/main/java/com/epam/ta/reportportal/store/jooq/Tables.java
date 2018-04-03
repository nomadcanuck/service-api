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
import com.epam.ta.reportportal.store.jooq.tables.JDefectFormFieldValue;
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
import com.epam.ta.reportportal.store.jooq.tables.JParameter;
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

import javax.annotation.Generated;


/**
 * Convenience access to all tables in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>public.bug_tracking_system</code>.
     */
    public static final JBugTrackingSystem BUG_TRACKING_SYSTEM = com.epam.ta.reportportal.store.jooq.tables.JBugTrackingSystem.BUG_TRACKING_SYSTEM;

    /**
     * The table <code>public.bug_tracking_system_auth</code>.
     */
    public static final JBugTrackingSystemAuth BUG_TRACKING_SYSTEM_AUTH = com.epam.ta.reportportal.store.jooq.tables.JBugTrackingSystemAuth.BUG_TRACKING_SYSTEM_AUTH;

    /**
     * The table <code>public.dashboard</code>.
     */
    public static final JDashboard DASHBOARD = com.epam.ta.reportportal.store.jooq.tables.JDashboard.DASHBOARD;

    /**
     * The table <code>public.dashboard_widget</code>.
     */
    public static final JDashboardWidget DASHBOARD_WIDGET = com.epam.ta.reportportal.store.jooq.tables.JDashboardWidget.DASHBOARD_WIDGET;

    /**
     * The table <code>public.defect_field_allowed_value</code>.
     */
    public static final JDefectFieldAllowedValue DEFECT_FIELD_ALLOWED_VALUE = com.epam.ta.reportportal.store.jooq.tables.JDefectFieldAllowedValue.DEFECT_FIELD_ALLOWED_VALUE;

    /**
     * The table <code>public.defect_form_field</code>.
     */
    public static final JDefectFormField DEFECT_FORM_FIELD = com.epam.ta.reportportal.store.jooq.tables.JDefectFormField.DEFECT_FORM_FIELD;

    /**
     * The table <code>public.defect_form_field_value</code>.
     */
    public static final JDefectFormFieldValue DEFECT_FORM_FIELD_VALUE = com.epam.ta.reportportal.store.jooq.tables.JDefectFormFieldValue.DEFECT_FORM_FIELD_VALUE;

    /**
     * The table <code>public.issue</code>.
     */
    public static final JIssue ISSUE = com.epam.ta.reportportal.store.jooq.tables.JIssue.ISSUE;

    /**
     * The table <code>public.issue_ticket</code>.
     */
    public static final JIssueTicket ISSUE_TICKET = com.epam.ta.reportportal.store.jooq.tables.JIssueTicket.ISSUE_TICKET;

    /**
     * The table <code>public.issue_type</code>.
     */
    public static final JIssueType ISSUE_TYPE = com.epam.ta.reportportal.store.jooq.tables.JIssueType.ISSUE_TYPE;

    /**
     * The table <code>public.issue_type_project_configuration</code>.
     */
    public static final JIssueTypeProjectConfiguration ISSUE_TYPE_PROJECT_CONFIGURATION = com.epam.ta.reportportal.store.jooq.tables.JIssueTypeProjectConfiguration.ISSUE_TYPE_PROJECT_CONFIGURATION;

    /**
     * The table <code>public.item_tag</code>.
     */
    public static final JItemTag ITEM_TAG = com.epam.ta.reportportal.store.jooq.tables.JItemTag.ITEM_TAG;

    /**
     * The table <code>public.launch</code>.
     */
    public static final JLaunch LAUNCH = com.epam.ta.reportportal.store.jooq.tables.JLaunch.LAUNCH;

    /**
     * The table <code>public.launch_tag</code>.
     */
    public static final JLaunchTag LAUNCH_TAG = com.epam.ta.reportportal.store.jooq.tables.JLaunchTag.LAUNCH_TAG;

    /**
     * The table <code>public.log</code>.
     */
    public static final JLog LOG = com.epam.ta.reportportal.store.jooq.tables.JLog.LOG;

    /**
     * The table <code>public.oauth_access_token</code>.
     */
    public static final JOauthAccessToken OAUTH_ACCESS_TOKEN = com.epam.ta.reportportal.store.jooq.tables.JOauthAccessToken.OAUTH_ACCESS_TOKEN;

    /**
     * The table <code>public.oauth_registration</code>.
     */
    public static final JOauthRegistration OAUTH_REGISTRATION = com.epam.ta.reportportal.store.jooq.tables.JOauthRegistration.OAUTH_REGISTRATION;

    /**
     * The table <code>public.oauth_registration_scope</code>.
     */
    public static final JOauthRegistrationScope OAUTH_REGISTRATION_SCOPE = com.epam.ta.reportportal.store.jooq.tables.JOauthRegistrationScope.OAUTH_REGISTRATION_SCOPE;

    /**
     * The table <code>public.parameter</code>.
     */
    public static final JParameter PARAMETER = com.epam.ta.reportportal.store.jooq.tables.JParameter.PARAMETER;

    /**
     * The table <code>public.project</code>.
     */
    public static final JProject PROJECT = com.epam.ta.reportportal.store.jooq.tables.JProject.PROJECT;

    /**
     * The table <code>public.project_configuration</code>.
     */
    public static final JProjectConfiguration PROJECT_CONFIGURATION = com.epam.ta.reportportal.store.jooq.tables.JProjectConfiguration.PROJECT_CONFIGURATION;

    /**
     * The table <code>public.project_email_configuration</code>.
     */
    public static final JProjectEmailConfiguration PROJECT_EMAIL_CONFIGURATION = com.epam.ta.reportportal.store.jooq.tables.JProjectEmailConfiguration.PROJECT_EMAIL_CONFIGURATION;

    /**
     * The table <code>public.project_user</code>.
     */
    public static final JProjectUser PROJECT_USER = com.epam.ta.reportportal.store.jooq.tables.JProjectUser.PROJECT_USER;

    /**
     * The table <code>public.server_settings</code>.
     */
    public static final JServerSettings SERVER_SETTINGS = com.epam.ta.reportportal.store.jooq.tables.JServerSettings.SERVER_SETTINGS;

    /**
     * The table <code>public.test_item</code>.
     */
    public static final JTestItem TEST_ITEM = com.epam.ta.reportportal.store.jooq.tables.JTestItem.TEST_ITEM;

    /**
     * The table <code>public.test_item_results</code>.
     */
    public static final JTestItemResults TEST_ITEM_RESULTS = com.epam.ta.reportportal.store.jooq.tables.JTestItemResults.TEST_ITEM_RESULTS;

    /**
     * The table <code>public.test_item_structure</code>.
     */
    public static final JTestItemStructure TEST_ITEM_STRUCTURE = com.epam.ta.reportportal.store.jooq.tables.JTestItemStructure.TEST_ITEM_STRUCTURE;

    /**
     * The table <code>public.ticket</code>.
     */
    public static final JTicket TICKET = com.epam.ta.reportportal.store.jooq.tables.JTicket.TICKET;

    /**
     * The table <code>public.users</code>.
     */
    public static final JUsers USERS = com.epam.ta.reportportal.store.jooq.tables.JUsers.USERS;

    /**
     * The table <code>public.widget</code>.
     */
    public static final JWidget WIDGET = com.epam.ta.reportportal.store.jooq.tables.JWidget.WIDGET;
}
