package com.usitrip.dao;

import com.usitrip.pojo.ChineseinlaComment;

import java.util.List;

public interface ChineseinlaCommentMapper {
    List<ChineseinlaComment> selectPhoneByLen(int len);
}
