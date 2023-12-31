package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class MemoryMemberRepository implements MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();
    private static Long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(sequence++);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Member> findByName(String name) {
        return Optional.empty();
    }

    @Override
    public List<Member> findAll() {
        return null;
    }
}
