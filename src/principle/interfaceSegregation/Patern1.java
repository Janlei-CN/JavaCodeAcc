package principle.interfaceSegregation;

/**
 * 接口隔离原则
 * 实现类只实现需要使用的方法，
 * 如果实现类无需使用接口中的方法，就违背了接口隔离原则
 */
public interface Patern1 {

    void oper1();

    void oper2();

    void oper3();
}
interface Patern2{

    void oper4();

    void oper5();

}
class C {
    public void oper1(A a){
        a.oper1();
    }
    public void oper2(A a){
        a.oper2();
    }
    public void oper3(A a){
        a.oper3();
    }
}

class D {
    public void oper4(B b){
        b.oper4();
    }
    public void oper5(B b){
        b.oper5();
    }
}


class A implements Patern1{

    @Override
    public void oper1() {
        System.out.println("A oper1");
    }

    @Override
    public void oper2() {
        System.out.println("A oper2");
    }

    @Override
    public void oper3() {
        System.out.println("A oper3");

    }
}
class B implements Patern2{

    @Override
    public void oper4() {
        System.out.println("B oper4");
    }

    @Override
    public void oper5() {
        System.out.println("B oper5");
    }
}