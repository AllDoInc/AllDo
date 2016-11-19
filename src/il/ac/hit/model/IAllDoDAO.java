package il.ac.hit.model;

public interface IAllDoDAO
{
	public Memo        getMemo() throws AllDoDAOExeption;
	public Memo[]      getMemos() throws AllDoDAOExeption;
	public boolean     addMemo() throws AllDoDAOExeption;
	public boolean     addMemos() throws AllDoDAOExeption;
	public boolean     deleteMemo() throws AllDoDAOExeption;
	public boolean     deleteMemos() throws AllDoDAOExeption;
	public boolean     setMemoType() throws AllDoDAOExeption;
	public MemoType    getMemoType() throws AllDoDAOExeption;
	public boolean     setMemoDateAndTime() throws AllDoDAOExeption;
	public DateAndTime getMemoDateAndTime() throws AllDoDAOExeption;
	public boolean     createUser() throws AllDoDAOExeption;
	public boolean     removeUser() throws AllDoDAOExeption;
	public boolean     sendToArchive() throws AllDoDAOExeption;
	public Memo        searchArchive() throws AllDoDAOExeption;
	public Statistic   getStatistic() throws AllDoDAOExeption;
	public boolean     setStatistic() throws AllDoDAOExeption;
}
