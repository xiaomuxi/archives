package com.project.archives.common.dao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;
import java.util.Arrays;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "CASE_INVES".
 */
@Entity
public class CaseInves implements Serializable {

    @Id
    private byte[] ID;
    private byte[] UserID;
    private String Name;
    private String Init;
    private String Position;
    private Integer Rank;
    private Integer Coding;
    private Integer IsPcongress;
    private Integer IsMember;
    private Integer IsObject;
    private Integer IsOfficer;
    private Integer IsPartyMember;
    private String Facts;
    private byte[] Discipline;
    private Integer Organ;
    private String PutTime;
    private String OutTime;
    private String SurveyContent;
    private Integer DisTypeD;
    private Integer DisTypeX;
    private String Note;
    private byte[] AnnexIDStr;
    private Integer isDelete;
    private String AddDate;
    private String AddUser;
    private String UpdateDate;
    private String UpdateUser;
    private String PoliticsStatus;
    private Integer Organization;
    private Integer Xiansou;
    private String ShouTime;
    private String Trail;
    private String Description;
    private String ChuheTime;
    private String LiaojieTime;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated(hash = 1809359934)
    public CaseInves() {
    }

    public CaseInves(byte[] ID) {
        this.ID = ID;
    }

    @Generated(hash = 24587135)
    public CaseInves(byte[] ID, byte[] UserID, String Name, String Init, String Position, Integer Rank, Integer Coding, Integer IsPcongress, Integer IsMember, Integer IsObject, Integer IsOfficer, Integer IsPartyMember, String Facts, byte[] Discipline, Integer Organ, String PutTime, String OutTime, String SurveyContent, Integer DisTypeD, String Note, byte[] AnnexIDStr, Integer isDelete, String AddDate, String AddUser, String UpdateDate, String UpdateUser, String PoliticsStatus, Integer Organization, Integer Xiansou, String ShouTime, String Trail, String Description, String ChuheTime, String LiaojieTime, Integer DisTypeX) {
        this.ID = ID;
        this.UserID = UserID;
        this.Name = Name;
        this.Init = Init;
        this.Position = Position;
        this.Rank = Rank;
        this.Coding = Coding;
        this.IsPcongress = IsPcongress;
        this.IsMember = IsMember;
        this.IsObject = IsObject;
        this.IsOfficer = IsOfficer;
        this.IsPartyMember = IsPartyMember;
        this.Facts = Facts;
        this.Discipline = Discipline;
        this.Organ = Organ;
        this.PutTime = PutTime;
        this.OutTime = OutTime;
        this.SurveyContent = SurveyContent;
        this.DisTypeD = DisTypeD;
        this.Note = Note;
        this.AnnexIDStr = AnnexIDStr;
        this.isDelete = isDelete;
        this.AddDate = AddDate;
        this.AddUser = AddUser;
        this.UpdateDate = UpdateDate;
        this.UpdateUser = UpdateUser;
        this.PoliticsStatus = PoliticsStatus;
        this.Organization = Organization;
        this.Xiansou = Xiansou;
        this.ShouTime = ShouTime;
        this.Trail = Trail;
        this.Description = Description;
        this.ChuheTime = ChuheTime;
        this.LiaojieTime = LiaojieTime;
        this.DisTypeX = DisTypeX;
    }

    public byte[] getID() {
        return ID;
    }

    public void setID(byte[] ID) {
        this.ID = ID;
    }

    public byte[] getUserID() {
        return UserID;
    }

    public void setUserID(byte[] UserID) {
        this.UserID = UserID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getInit() {
        return Init;
    }

    public void setInit(String Init) {
        this.Init = Init;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public Integer getRank() {
        return Rank;
    }

    public void setRank(Integer Rank) {
        this.Rank = Rank;
    }

    public Integer getCoding() {
        return Coding;
    }

    public void setCoding(Integer Coding) {
        this.Coding = Coding;
    }

    public Integer getIsPcongress() {
        return IsPcongress;
    }

    public void setIsPcongress(Integer IsPcongress) {
        this.IsPcongress = IsPcongress;
    }

    public Integer getIsMember() {
        return IsMember;
    }

    public void setIsMember(Integer IsMember) {
        this.IsMember = IsMember;
    }

    public Integer getIsObject() {
        return IsObject;
    }

    public void setIsObject(Integer IsObject) {
        this.IsObject = IsObject;
    }

    public Integer getIsOfficer() {
        return IsOfficer;
    }

    public void setIsOfficer(Integer IsOfficer) {
        this.IsOfficer = IsOfficer;
    }

    public Integer getIsPartyMember() {
        return IsPartyMember;
    }

    public void setIsPartyMember(Integer IsPartyMember) {
        this.IsPartyMember = IsPartyMember;
    }

    public String getFacts() {
        return Facts;
    }

    public void setFacts(String Facts) {
        this.Facts = Facts;
    }

    public byte[] getDiscipline() {
        return Discipline;
    }

    public void setDiscipline(byte[] Discipline) {
        this.Discipline = Discipline;
    }

    public Integer getOrgan() {
        return Organ;
    }

    public void setOrgan(Integer Organ) {
        this.Organ = Organ;
    }

    public String getPutTime() {
        return PutTime;
    }

    public void setPutTime(String PutTime) {
        this.PutTime = PutTime;
    }

    public String getOutTime() {
        return OutTime;
    }

    public void setOutTime(String OutTime) {
        this.OutTime = OutTime;
    }

    public String getSurveyContent() {
        return SurveyContent;
    }

    public void setSurveyContent(String SurveyContent) {
        this.SurveyContent = SurveyContent;
    }

    public Integer getDisTypeD() {
        return DisTypeD;
    }

    public void setDisTypeD(Integer DisTypeD) {
        this.DisTypeD = DisTypeD;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public byte[] getAnnexIDStr() {
        return AnnexIDStr;
    }

    public void setAnnexIDStr(byte[] AnnexIDStr) {
        this.AnnexIDStr = AnnexIDStr;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getAddDate() {
        return AddDate;
    }

    public void setAddDate(String AddDate) {
        this.AddDate = AddDate;
    }

    public String getAddUser() {
        return AddUser;
    }

    public void setAddUser(String AddUser) {
        this.AddUser = AddUser;
    }

    public String getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(String UpdateDate) {
        this.UpdateDate = UpdateDate;
    }

    public String getUpdateUser() {
        return UpdateUser;
    }

    public void setUpdateUser(String UpdateUser) {
        this.UpdateUser = UpdateUser;
    }

    public String getPoliticsStatus() {
        return PoliticsStatus;
    }

    public void setPoliticsStatus(String PoliticsStatus) {
        this.PoliticsStatus = PoliticsStatus;
    }

    public Integer getOrganization() {
        return Organization;
    }

    public void setOrganization(Integer Organization) {
        this.Organization = Organization;
    }

    public Integer getXiansou() {
        return Xiansou;
    }

    public void setXiansou(Integer Xiansou) {
        this.Xiansou = Xiansou;
    }

    public String getShouTime() {
        return ShouTime;
    }

    public void setShouTime(String ShouTime) {
        this.ShouTime = ShouTime;
    }

    public String getTrail() {
        return Trail;
    }

    public void setTrail(String Trail) {
        this.Trail = Trail;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getChuheTime() {
        return ChuheTime;
    }

    public void setChuheTime(String ChuheTime) {
        this.ChuheTime = ChuheTime;
    }

    public String getLiaojieTime() {
        return LiaojieTime;
    }

    public void setLiaojieTime(String LiaojieTime) {
        this.LiaojieTime = LiaojieTime;
    }

    public Integer getDisTypeX() {
        return DisTypeX;
    }

    public void setDisTypeX(Integer disTypeX) {
        DisTypeX = disTypeX;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

    @Override
    public String toString() {
        return "CaseInves{" +
                "ID=" + Arrays.toString(ID) +
                ", UserID=" + Arrays.toString(UserID) +
                ", Name='" + Name + '\'' +
                ", Init='" + Init + '\'' +
                ", Position='" + Position + '\'' +
                ", Rank=" + Rank +
                ", Coding=" + Coding +
                ", IsPcongress=" + IsPcongress +
                ", IsMember=" + IsMember +
                ", IsObject=" + IsObject +
                ", IsOfficer=" + IsOfficer +
                ", IsPartyMember=" + IsPartyMember +
                ", Facts='" + Facts + '\'' +
                ", Discipline=" + Arrays.toString(Discipline) +
                ", Organ=" + Organ +
                ", PutTime=" + PutTime +
                ", OutTime=" + OutTime +
                ", SurveyContent='" + SurveyContent + '\'' +
                ", DisTypeD=" + DisTypeD +
                ", Note='" + Note + '\'' +
                ", AnnexIDStr=" + Arrays.toString(AnnexIDStr) +
                ", isDelete=" + isDelete +
                ", AddDate=" + AddDate +
                ", AddUser='" + AddUser + '\'' +
                ", UpdateDate=" + UpdateDate +
                ", UpdateUser='" + UpdateUser + '\'' +
                ", PoliticsStatus='" + PoliticsStatus + '\'' +
                ", Organization=" + Organization +
                ", Xiansou=" + Xiansou +
                ", ShouTime=" + ShouTime +
                ", Trail='" + Trail + '\'' +
                ", Description='" + Description + '\'' +
                ", ChuheTime=" + ChuheTime +
                ", LiaojieTime=" + LiaojieTime +
                ", DisTypeX=" + DisTypeX +
                '}';
    }
}
