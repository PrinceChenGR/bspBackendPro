package com.example.bsppro.service.impl;

import com.example.bsppro.entity.Member;
import com.example.bsppro.mapper.MemberMapper;
import com.example.bsppro.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author LT
 * @since 2023-02-15
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
