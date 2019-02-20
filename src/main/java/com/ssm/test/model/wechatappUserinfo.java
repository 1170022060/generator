package com.ssm.test.model;

import java.util.Date;

public class wechatappUserinfo {
    private Long id;

    private String headpicture;

    private String username;

    private String sex;

    private String mobile;

    private String address;

    private String idcard;

    private String initid;

    private String openid;

    private String communityname;

    private String communitytype;

    private String communityid;

    private String orgtype;

    private String orgid;

    private String orgpath;

    private String orgname;

    private String state;

    private String imgurl;

    private String password;

    private String def4;

    private String unionid;

    private String hobby;

    private String hobbygroup;

    private String peoplestate;

    private String stategroup;

    private String realname;

    private Date createtime;

    private Integer istuser;

    private String apptype;

    private String serverip;

    private String servername;

    private Integer point;

    private Long serverid;

    private String signature;

    private String positions;

    private String wxaqrcode;

    private String firstName;

    private Long postid;

    private Long createUserCommunityId;

    private Long createUserCommunityType;

    public wechatappUserinfo(Long id, String headpicture, String username, String sex, String mobile, String address, String idcard, String initid, String openid, String communityname, String communitytype, String communityid, String orgtype, String orgid, String orgpath, String orgname, String state, String imgurl, String password, String def4, String unionid, String hobby, String hobbygroup, String peoplestate, String stategroup, String realname, Date createtime, Integer istuser, String apptype, String serverip, String servername, Integer point, Long serverid, String signature, String positions, String wxaqrcode, String firstName, Long postid, Long createUserCommunityId, Long createUserCommunityType) {
        this.id = id;
        this.headpicture = headpicture;
        this.username = username;
        this.sex = sex;
        this.mobile = mobile;
        this.address = address;
        this.idcard = idcard;
        this.initid = initid;
        this.openid = openid;
        this.communityname = communityname;
        this.communitytype = communitytype;
        this.communityid = communityid;
        this.orgtype = orgtype;
        this.orgid = orgid;
        this.orgpath = orgpath;
        this.orgname = orgname;
        this.state = state;
        this.imgurl = imgurl;
        this.password = password;
        this.def4 = def4;
        this.unionid = unionid;
        this.hobby = hobby;
        this.hobbygroup = hobbygroup;
        this.peoplestate = peoplestate;
        this.stategroup = stategroup;
        this.realname = realname;
        this.createtime = createtime;
        this.istuser = istuser;
        this.apptype = apptype;
        this.serverip = serverip;
        this.servername = servername;
        this.point = point;
        this.serverid = serverid;
        this.signature = signature;
        this.positions = positions;
        this.wxaqrcode = wxaqrcode;
        this.firstName = firstName;
        this.postid = postid;
        this.createUserCommunityId = createUserCommunityId;
        this.createUserCommunityType = createUserCommunityType;
    }

    public wechatappUserinfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeadpicture() {
        return headpicture;
    }

    public void setHeadpicture(String headpicture) {
        this.headpicture = headpicture == null ? null : headpicture.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getInitid() {
        return initid;
    }

    public void setInitid(String initid) {
        this.initid = initid == null ? null : initid.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getCommunityname() {
        return communityname;
    }

    public void setCommunityname(String communityname) {
        this.communityname = communityname == null ? null : communityname.trim();
    }

    public String getCommunitytype() {
        return communitytype;
    }

    public void setCommunitytype(String communitytype) {
        this.communitytype = communitytype == null ? null : communitytype.trim();
    }

    public String getCommunityid() {
        return communityid;
    }

    public void setCommunityid(String communityid) {
        this.communityid = communityid == null ? null : communityid.trim();
    }

    public String getOrgtype() {
        return orgtype;
    }

    public void setOrgtype(String orgtype) {
        this.orgtype = orgtype == null ? null : orgtype.trim();
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid == null ? null : orgid.trim();
    }

    public String getOrgpath() {
        return orgpath;
    }

    public void setOrgpath(String orgpath) {
        this.orgpath = orgpath == null ? null : orgpath.trim();
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname == null ? null : orgname.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getDef4() {
        return def4;
    }

    public void setDef4(String def4) {
        this.def4 = def4 == null ? null : def4.trim();
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getHobbygroup() {
        return hobbygroup;
    }

    public void setHobbygroup(String hobbygroup) {
        this.hobbygroup = hobbygroup == null ? null : hobbygroup.trim();
    }

    public String getPeoplestate() {
        return peoplestate;
    }

    public void setPeoplestate(String peoplestate) {
        this.peoplestate = peoplestate == null ? null : peoplestate.trim();
    }

    public String getStategroup() {
        return stategroup;
    }

    public void setStategroup(String stategroup) {
        this.stategroup = stategroup == null ? null : stategroup.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getIstuser() {
        return istuser;
    }

    public void setIstuser(Integer istuser) {
        this.istuser = istuser;
    }

    public String getApptype() {
        return apptype;
    }

    public void setApptype(String apptype) {
        this.apptype = apptype == null ? null : apptype.trim();
    }

    public String getServerip() {
        return serverip;
    }

    public void setServerip(String serverip) {
        this.serverip = serverip == null ? null : serverip.trim();
    }

    public String getServername() {
        return servername;
    }

    public void setServername(String servername) {
        this.servername = servername == null ? null : servername.trim();
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Long getServerid() {
        return serverid;
    }

    public void setServerid(Long serverid) {
        this.serverid = serverid;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getPositions() {
        return positions;
    }

    public void setPositions(String positions) {
        this.positions = positions == null ? null : positions.trim();
    }

    public String getWxaqrcode() {
        return wxaqrcode;
    }

    public void setWxaqrcode(String wxaqrcode) {
        this.wxaqrcode = wxaqrcode == null ? null : wxaqrcode.trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    public Long getPostid() {
        return postid;
    }

    public void setPostid(Long postid) {
        this.postid = postid;
    }

    public Long getCreateUserCommunityId() {
        return createUserCommunityId;
    }

    public void setCreateUserCommunityId(Long createUserCommunityId) {
        this.createUserCommunityId = createUserCommunityId;
    }

    public Long getCreateUserCommunityType() {
        return createUserCommunityType;
    }

    public void setCreateUserCommunityType(Long createUserCommunityType) {
        this.createUserCommunityType = createUserCommunityType;
    }
}