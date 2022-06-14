package market.service;

import java.util.List;

import market.model.Board;

public interface BoardService {

	List<Board> list(Board board);

	int getTotal(Board board);

	int insert(Board board);

	Board select(int num);

	void selectUpdate(int num);

	int update(Board board);

	int delete(int num);

	int getMaxNum();

	void updateRe(Board board);
}