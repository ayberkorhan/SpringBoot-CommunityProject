package com.example.demo.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Community")
public class Community implements Serializable {

    public Long getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Long communityId) {
        this.communityId = communityId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long communityId;




    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }


    @OneToMany(mappedBy = "community")
      Set<UserCommunity> userCommunity;

    private String description;

    private String communityName;




}
