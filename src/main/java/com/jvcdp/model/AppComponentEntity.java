package com.jvcdp.model;

import javax.persistence.*;

@Entity
public class AppComponentEntity {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String availabilityDev;
    @Column
    private String availabilitySit;
    @Column
    private String availabilityUat;
    @Column
    private String availabilityQa;
    @Column
    private String availabilityProd;
    @Column
    private String versionControl;
    @Column
    private String infraProvisioningAutomation;
    @Column
    private String configManagement;
    @Column
    private String appBuildAutomation;
    @Column
    private String appSetupAutomation;
    @Column
    private String unitTesting;
    @Column
    private String integrationTesting;
    @Column
    private String regresssionTesting;
    @Column
    private String performanceTesting;
    @Column
    private String staticCodeAnalysis;
    @Column
    private String vulnerabilityScanning;
    @Column
    private String releaseManagement;
    @Column
    private String cicdAutomation;
    @Column
    private String infraTelemetry;
    @Column
    private String appTelemetry;
    @Column
    private String continuousImprovement;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvailabilityDev() {
        return availabilityDev;
    }

    public void setAvailabilityDev(String availabilityDev) {
        this.availabilityDev = availabilityDev;
    }

    public String getAvailabilitySit() {
        return availabilitySit;
    }

    public void setAvailabilitySit(String availabilitySit) {
        this.availabilitySit = availabilitySit;
    }

    public String getAvailabilityUat() {
        return availabilityUat;
    }

    public void setAvailabilityUat(String availabilityUat) {
        this.availabilityUat = availabilityUat;
    }

    public String getAvailabilityQa() {
        return availabilityQa;
    }

    public void setAvailabilityQa(String availabilityQa) {
        this.availabilityQa = availabilityQa;
    }

    public String getAvailabilityProd() {
        return availabilityProd;
    }

    public void setAvailabilityProd(String availabilityProd) {
        this.availabilityProd = availabilityProd;
    }

    public String getVersionControl() {
        return versionControl;
    }

    public void setVersionControl(String versionControl) {
        this.versionControl = versionControl;
    }

    public String getInfraProvisioningAutomation() {
        return infraProvisioningAutomation;
    }

    public void setInfraProvisioningAutomation(String infraProvisioningAutomation) {
        this.infraProvisioningAutomation = infraProvisioningAutomation;
    }

    public String getConfigManagement() {
        return configManagement;
    }

    public void setConfigManagement(String configManagement) {
        this.configManagement = configManagement;
    }

    public String getAppBuildAutomation() {
        return appBuildAutomation;
    }

    public void setAppBuildAutomation(String appBuildAutomation) {
        this.appBuildAutomation = appBuildAutomation;
    }

    public String getAppSetupAutomation() {
        return appSetupAutomation;
    }

    public void setAppSetupAutomation(String appSetupAutomation) {
        this.appSetupAutomation = appSetupAutomation;
    }

    public String getUnitTesting() {
        return unitTesting;
    }

    public void setUnitTesting(String unitTesting) {
        this.unitTesting = unitTesting;
    }

    public String getIntegrationTesting() {
        return integrationTesting;
    }

    public void setIntegrationTesting(String integrationTesting) {
        this.integrationTesting = integrationTesting;
    }

    public String getRegresssionTesting() {
        return regresssionTesting;
    }

    public void setRegresssionTesting(String regresssionTesting) {
        this.regresssionTesting = regresssionTesting;
    }

    public String getPerformanceTesting() {
        return performanceTesting;
    }

    public void setPerformanceTesting(String performanceTesting) {
        this.performanceTesting = performanceTesting;
    }

    public String getStaticCodeAnalysis() {
        return staticCodeAnalysis;
    }

    public void setStaticCodeAnalysis(String staticCodeAnalysis) {
        this.staticCodeAnalysis = staticCodeAnalysis;
    }

    public String getVulnerabilityScanning() {
        return vulnerabilityScanning;
    }

    public void setVulnerabilityScanning(String vulnerabilityScanning) {
        this.vulnerabilityScanning = vulnerabilityScanning;
    }

    public String getReleaseManagement() {
        return releaseManagement;
    }

    public void setReleaseManagement(String releaseManagement) {
        this.releaseManagement = releaseManagement;
    }

    public String getCicdAutomation() {
        return cicdAutomation;
    }

    public void setCicdAutomation(String cicdAutomation) {
        this.cicdAutomation = cicdAutomation;
    }

    public String getInfraTelemetry() {
        return infraTelemetry;
    }

    public void setInfraTelemetry(String infraTelemetry) {
        this.infraTelemetry = infraTelemetry;
    }

    public String getAppTelemetry() {
        return appTelemetry;
    }

    public void setAppTelemetry(String appTelemetry) {
        this.appTelemetry = appTelemetry;
    }

    public String getContinuousImprovement() {
        return continuousImprovement;
    }

    public void setContinuousImprovement(String continuousImprovement) {
        this.continuousImprovement = continuousImprovement;
    }
}
