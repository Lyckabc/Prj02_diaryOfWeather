package zerobase.weather.repository;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import zerobase.weather.domain.Memo;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/****************************************************
 **                                                 **
 **        weather                          **
 **        JpaMemoRepositoryTest                                  **
 **        Made by Toji                          **
 **        2024-02-27 :오전 4:11                         **
 **        https://github.com/lyckabc               **
 **                                                 **
 ****************************************************/
@SpringBootTest
@Transactional
class JpaMemoRepositoryTest {
    @Autowired
    JpaMemoRepository jpaMemoRepository;

    @Test
    void insertMemoTest() {
        //given
        Memo newMemo = new Memo(10, "this is jpa memo");
        //when
        jpaMemoRepository.save(newMemo);
        //then
        List<Memo> memoList = jpaMemoRepository.findAll();
        assertTrue(memoList.size() > 0);
    }

    @Test
    void findByIdTest() {
        //given
        Memo newMemo = new Memo(11, "jpa");
        //when
        Memo Memo = jpaMemoRepository.save(newMemo);
        System.out.println("test MemoID : " + Memo.getId());
        //then
        Optional<Memo> result = jpaMemoRepository.findById(Memo.getId());
        assertEquals(result.get().getText(), "jpa");
    }
}