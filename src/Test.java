//
//
//    public class Test {
//        public static void main(String[] args) {
//            //调用子类父类都有的类型
//            Animal a= new Dog();
//            //编译看左边，运行看右边
//            a.eat();
//
//            //多态弊端，不能调用子类的特有功能
//           //a.lookHome();
//           //解决方法
//           //变回子类类型
////           Dog d=(Dog)a;
////           d.lookHome();
//
//
//            if(a instanceof Dog){
//                Dog d=(Dog)a;
//            } else if (a instanceof Cat) {
//                Cat c=(Cat)a;
//            }else {
//                System.out.println("没有这个类型无法转换");
//            }
//
//            //新特性
////            if(a instanceof Dog d){
////                d.lookHome();                                //jdk14的特性
////            } else if (a instanceof Cat c) {
////                c.catchMouse();
////            }else {
////                System.out.println("没有这个类型无法转换");
////            }
//
//        }
//}
//        class Animal{
//            public void eat() {
//                System.out.println("动物吃饭");
//            }
//
//        }
//        class Dog extends Animal{
//            @Override
//            public void eat() {
//                System.out.println("狗吃骨头");
//            }
//            public void lookHome(){
//                System.out.println("看家");
//            }
//        }
//        class Cat extends Animal{
//            @Override
//            public void eat() {
//                System.out.println("猫吃小鱼干");
//            }
//            public void catchMouse(){
//                System.out.println("猫抓老鼠");
//            }
//        }
//
//
//


public class Test {
    public static void main(String[] args) {
//        Dog d=new Dog(2,"黑色");
//        Person p=new Person(30,"老王");
//        p.KeepPet(d,"骨头");
//
//
//        Cat c=new Cat(3,"灰色");
//        Person p1=new Person(25,"老李");
//        p1.KeepPet(c,"鱼");

//多态
        Person p=new Person(30,"老王");
        Dog d=new Dog(2,"黑色");
        Cat c=new Cat(3,"灰色");
        p.KeepPet(c,"鱼");
        p.KeepPet(d,"骨头");
    }


}