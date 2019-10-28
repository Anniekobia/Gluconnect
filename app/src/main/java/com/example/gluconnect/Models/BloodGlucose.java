
package com.example.gluconnect.Models;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class BloodGlucose {

    @SerializedName("blood_glucose_level")
    private Double mBloodGlucoseLevel;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("id")
    private Long mId;
    @SerializedName("type")
    private String mType;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("user_id")
    private Long mUserId;

    public BloodGlucose(Double mBloodGlucoseLevel, String mType, Long mUserId) {
        this.mBloodGlucoseLevel = mBloodGlucoseLevel;
        this.mType = mType;
        this.mUserId = mUserId;
    }

    public Double getBloodGlucoseLevel() {
        return mBloodGlucoseLevel;
    }

    public void setBloodGlucoseLevel(Double bloodGlucoseLevel) {
        mBloodGlucoseLevel = bloodGlucoseLevel;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public Long getId() {
        return mId;
    }

    public void setId(Long id) {
        mId = id;
    }

    public String getType() {
        return mType;
    }

    public void setType(String type) {
        mType = type;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public Long getUserId() {
        return mUserId;
    }

    public void setUserId(Long userId) {
        mUserId = userId;
    }

}
