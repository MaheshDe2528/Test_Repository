package Base;

public interface ISqlDAO {

	public String all();
	public String findByCode();
	public String create();
	public String update();
	public String delete();
	public String findAllByAttributes();
}
