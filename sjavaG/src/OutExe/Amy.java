package OutExe;

public class Amy {
    public static void main(String[] args) {
        WvPao pao = new Pao();
        SaveAmy sa = new SaveAmy();

        sa.addwp(pao);
    }
}

class SaveAmy{
    WvPao[] wp = new WvPao[5];

    public SaveAmy() {
    }

    public SaveAmy(WvPao[] wp) {
        this.wp = wp;
    }

    public void addwp(WvPao wp) {
        for (int i = 0; i < this.wp.length - 1; i++) {
            if (null == this.wp[i]) {
                this.wp[i] = wp;
                return;
            }
        }
    }

    public void gongji() {

    }
}

interface WvPao{
    void gongji();
}

class Pao implements WvPao {

    String name = "pao";
    @Override
    public void gongji() {
        System.out.println("Pao gongji");
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (obj == this) return true;
        if (obj instanceof Pao) {
            return ((Pao)obj).name.equals(this.name);
        }
        return false;
    }
}
