package Project.Projectspring.AllQuestionAnswer.DAO;

import Project.Projectspring.AllQuestionAnswer.VO.AllAnswerVO;
import Project.Projectspring.AllQuestionAnswer.VO.AllQuestionVO;
import Project.Projectspring.AllQuestionAnswer.VO.AnswerNeedVO;
import Project.Projectspring.AllQuestionAnswer.VO.QuestionListVO;

import java.util.List;

public interface AllQuestionAnswerDAOin {

    List<AllAnswerVO> getAnswer (AnswerNeedVO answerNeedVO) throws Exception;

    List<QuestionListVO> getQuestion(int group_id) throws Exception;
}
