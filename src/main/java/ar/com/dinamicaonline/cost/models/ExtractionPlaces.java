package ar.com.dinamicaonline.cost.models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "api_ExtractionPlaces")
public class ExtractionPlaces {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int idCategoryPayment;
    private String name;
    private double minExtractionAmount;
    private double minExtractionCommision;
    private double extractionCommisionPercent;
    private double maxExtractionAmount;
    private double maxExtractionCommisionZero;
    private int maxExtractionCount;
    private double minDepositAmount;
    private double maxDepositAmount;
    private double minDepositCommision;
    private double depositCommisionPercent;
    private double maxDepositCommisionZero;
    private int maxDepositCount;
    private int depositAccreditationTime;
    private String imageUrl;
    private int depositEnabled;
    private int extractionEnabled;
    private int active;
    private String creatorUser;
    private Date createdOn;
    private String modifierUser;
    private Date updatedOn;
    
    public ExtractionPlaces() {
    }

    public ExtractionPlaces(int id, int idCategoryPayment, String name, double minExtractionAmount,
            double minExtractionCommision, double extractionCommisionPercent, double maxExtractionAmount,
            double maxExtractionCommisionZero, int maxExtractionCount, double minDepositAmount, double maxDepositAmount,
            double minDepositCommision, double depositCommisionPercent, double maxDepositCommisionZero,
            int maxDepositCount, int depositAccreditationTime, String imageUrl, int depositEnabled,
            int extractionEnabled, int active, String creatorUser, Date createdOn, String modifierUser,
            Date updatedOn) {
        this.id = id;
        this.idCategoryPayment = idCategoryPayment;
        this.name = name;
        this.minExtractionAmount = minExtractionAmount;
        this.minExtractionCommision = minExtractionCommision;
        this.extractionCommisionPercent = extractionCommisionPercent;
        this.maxExtractionAmount = maxExtractionAmount;
        this.maxExtractionCommisionZero = maxExtractionCommisionZero;
        this.maxExtractionCount = maxExtractionCount;
        this.minDepositAmount = minDepositAmount;
        this.maxDepositAmount = maxDepositAmount;
        this.minDepositCommision = minDepositCommision;
        this.depositCommisionPercent = depositCommisionPercent;
        this.maxDepositCommisionZero = maxDepositCommisionZero;
        this.maxDepositCount = maxDepositCount;
        this.depositAccreditationTime = depositAccreditationTime;
        this.imageUrl = imageUrl;
        this.depositEnabled = depositEnabled;
        this.extractionEnabled = extractionEnabled;
        this.active = active;
        this.creatorUser = creatorUser;
        this.createdOn = createdOn;
        this.modifierUser = modifierUser;
        this.updatedOn = updatedOn;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getIdCategoryPayment() {
        return idCategoryPayment;
    }
    public void setIdCategoryPayment(int idCategoryPayment) {
        this.idCategoryPayment = idCategoryPayment;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getMinExtractionAmount() {
        return minExtractionAmount;
    }
    public void setMinExtractionAmount(double minExtractionAmount) {
        this.minExtractionAmount = minExtractionAmount;
    }
    public double getMinExtractionCommision() {
        return minExtractionCommision;
    }
    public void setMinExtractionCommision(double minExtractionCommision) {
        this.minExtractionCommision = minExtractionCommision;
    }
    public double getExtractionCommisionPercent() {
        return extractionCommisionPercent;
    }
    public void setExtractionCommisionPercent(double extractionCommisionPercent) {
        this.extractionCommisionPercent = extractionCommisionPercent;
    }
    public double getMaxExtractionAmount() {
        return maxExtractionAmount;
    }
    public void setMaxExtractionAmount(double maxExtractionAmount) {
        this.maxExtractionAmount = maxExtractionAmount;
    }
    public double getMaxExtractionCommisionZero() {
        return maxExtractionCommisionZero;
    }
    public void setMaxExtractionCommisionZero(double maxExtractionCommisionZero) {
        this.maxExtractionCommisionZero = maxExtractionCommisionZero;
    }
    public int getMaxExtractionCount() {
        return maxExtractionCount;
    }
    public void setMaxExtractionCount(int maxExtractionCount) {
        this.maxExtractionCount = maxExtractionCount;
    }
    public double getMinDepositAmount() {
        return minDepositAmount;
    }
    public void setMinDepositAmount(double minDepositAmount) {
        this.minDepositAmount = minDepositAmount;
    }
    public double getMaxDepositAmount() {
        return maxDepositAmount;
    }
    public void setMaxDepositAmount(double maxDepositAmount) {
        this.maxDepositAmount = maxDepositAmount;
    }
    public double getMinDepositCommision() {
        return minDepositCommision;
    }
    public void setMinDepositCommision(double minDepositCommision) {
        this.minDepositCommision = minDepositCommision;
    }
    public double getDepositCommisionPercent() {
        return depositCommisionPercent;
    }
    public void setDepositCommisionPercent(double depositCommisionPercent) {
        this.depositCommisionPercent = depositCommisionPercent;
    }
    public double getMaxDepositCommisionZero() {
        return maxDepositCommisionZero;
    }
    public void setMaxDepositCommisionZero(double maxDepositCommisionZero) {
        this.maxDepositCommisionZero = maxDepositCommisionZero;
    }
    public int getMaxDepositCount() {
        return maxDepositCount;
    }
    public void setMaxDepositCount(int maxDepositCount) {
        this.maxDepositCount = maxDepositCount;
    }
    public int getDepositAccreditationTime() {
        return depositAccreditationTime;
    }
    public void setDepositAccreditationTime(int depositAccreditationTime) {
        this.depositAccreditationTime = depositAccreditationTime;
    }
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    public int getDepositEnabled() {
        return depositEnabled;
    }
    public void setDepositEnabled(int depositEnabled) {
        this.depositEnabled = depositEnabled;
    }
    public int getExtractionEnabled() {
        return extractionEnabled;
    }
    public void setExtractionEnabled(int extractionEnabled) {
        this.extractionEnabled = extractionEnabled;
    }
    public int getActive() {
        return active;
    }
    public void setActive(int active) {
        this.active = active;
    }
    public String getCreatorUser() {
        return creatorUser;
    }
    public void setCreatorUser(String creatorUser) {
        this.creatorUser = creatorUser;
    }
    public Date getCreatedOn() {
        return createdOn;
    }
    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
    public String getModifierUser() {
        return modifierUser;
    }
    public void setModifierUser(String modifierUser) {
        this.modifierUser = modifierUser;
    }
    public Date getUpdatedOn() {
        return updatedOn;
    }
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    
}
