package com.xulala.SSMTemplate.dao;


import com.xulala.SSMTemplate.entity.AgencyKey;

import java.util.List;

public interface AgencyKeyMapper {
     AgencyKey selectByAgencyNo(String agencyNo);
     List<AgencyKey> selectAll();
}
