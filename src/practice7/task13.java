package practice7;

public class task13 {
    private String table;
    private String fields = "*";
    private String whereClause = "";

    public task13(String table) {
        this.table = table;
    }

    public task13 select(String fields) {
        this.fields = fields;
        return this;
    }

    public task13 where(String condition) {
        this.whereClause = condition;
        return this;
    }

    public String build() {
        return "SELECT " + fields + " FROM " + table + (whereClause.isEmpty() ? "" : " WHERE " + whereClause) + ";";
    }

    public static void main(String[] args) {
        String sql = new task13("users").select("id, name, email").where("age >= 18").build();
        System.out.println(sql);

        String sql2 = new task13("products").build();
        System.out.println(sql2);

        String sql3 = new task13("orders").where("total > 1000").build();
        System.out.println(sql3);
    }
}
