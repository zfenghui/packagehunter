/*
 * Copyright (C) 2016 Nishant Srivastava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package github.nisrulz.packagehunter;

import android.content.pm.ActivityInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.graphics.drawable.Drawable;

public class PkgInfo {
  private String appName;
  private String packageName;
  private String versionName;
  private int versionCode = 0;
  private long firstInstallTime;
  private long lastUpdateTime;
  private Drawable icon;

  private ActivityInfo[] activityInfos;
  private ConfigurationInfo[] configurationInfos;
  private FeatureInfo[] featureInfos;
  private String[] requestedPermissions;
  private ProviderInfo[] providerInfos;
  private ActivityInfo[] receiversInfo;

  public PkgInfo() {
    versionName = "0.0";
    versionCode = 0;
    firstInstallTime = 0;
    lastUpdateTime = 0;
    activityInfos = null;
    configurationInfos = null;
    featureInfos = null;
    requestedPermissions = null;
    providerInfos = null;
    receiversInfo = null;
  }

  public ActivityInfo[] getReceiversInfo() {
    return receiversInfo;
  }

  public void setReceiversInfo(ActivityInfo[] receiversInfo) {
    this.receiversInfo = receiversInfo;
  }

  public ActivityInfo[] getActivityInfos() {
    return activityInfos;
  }

  public void setActivityInfos(ActivityInfo[] activityInfos) {
    this.activityInfos = activityInfos;
  }

  public ConfigurationInfo[] getConfigurationInfos() {
    return configurationInfos;
  }

  public void setConfigurationInfos(ConfigurationInfo[] configurationInfos) {
    this.configurationInfos = configurationInfos;
  }

  public FeatureInfo[] getFeatureInfos() {
    return featureInfos;
  }

  public void setFeatureInfos(FeatureInfo[] featureInfos) {
    this.featureInfos = featureInfos;
  }

  public long getFirstInstallTime() {
    return firstInstallTime;
  }

  public void setFirstInstallTime(long firstInstallTime) {
    this.firstInstallTime = firstInstallTime;
  }

  public long getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(long lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

  public ProviderInfo[] getProviderInfos() {
    return providerInfos;
  }

  public void setProviderInfos(ProviderInfo[] providerInfos) {
    this.providerInfos = providerInfos;
  }

  public String[] getRequestedPermissions() {
    return requestedPermissions;
  }

  public void setRequestedPermissions(String[] requestedPermissions) {
    this.requestedPermissions = requestedPermissions;
  }

  public ServiceInfo[] getServiceInfos() {
    return serviceInfos;
  }

  public void setServiceInfos(ServiceInfo[] serviceInfos) {
    this.serviceInfos = serviceInfos;
  }

  private ServiceInfo[] serviceInfos;

  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public String getPackageName() {
    return packageName;
  }

  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  public Drawable getIcon() {
    return icon;
  }

  public void setIcon(Drawable icon) {
    this.icon = icon;
  }

  public int getVersionCode() {
    return versionCode;
  }

  public void setVersionCode(int versionCode) {
    this.versionCode = versionCode;
  }

  public String getVersionName() {
    return versionName;
  }

  public void setVersionName(String versionName) {
    this.versionName = versionName;
  }

  @Override public String toString() {
    super.toString();
    return "AppName : "
        + appName
        + " | PackageName :"
        + packageName
        + "\nVersion :"
        + versionName
        + " | VersionCode :"
        + versionCode;
  }
}

