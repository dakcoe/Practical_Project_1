public interface ICRUD {
    public Object add();
    public int update(object obj);
    public int delete(object obj);
    public void selectOne(int id);
}