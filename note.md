# Java设计模式笔记
## 0. 设计模式的六大原则
### 0.1 单一职责原则 （简单来说：一个类只负责一个功能领域中的相应职责）
    一个类只负责一个功能领域中的相应职责，或者可以定义为：就一个类而言，应该只有一个引起它变化的原因。
    如果一个类承担的职责过多，就等于把这些职责耦合在一起，一个职责的变化可能会削弱或者抑制这个类完成其他职责的能力。
### 0.2 开闭原则 （简单来说：对扩展开放，对修改关闭）
    所谓的开闭，也就是说对扩展是开放的，对修改是关闭的。
    主要是为了可以更好的扩展和维护代码，增加新功能是对原有代码进行修改可能会影响已有功能，造成危险，比如修改了一个bug，可能会引发其他bug。
### 0.3 里氏替换原则 （简单来说：子类可以替换父类，但是父类不能替换子类）
    里氏替换原则的核心思想是，子类对象能够完全替代父类对象，而不会影响程序的正确性。
    比如说，有一个父类叫做动物，有一个抽象方法叫做eat，有两个子类，一个狗一个猫，狗和猫都继承自动物类，如果他们实现eat方法的时候，狗吃骨头，猫吃鱼，这样的话没问题
    但如果猫类实现eat方法的时候只打印了一个字符串，就可能导致程序错误，就违反了里氏替换原则。
### 0.4 依赖倒置原则 （简单来说：通过依赖抽象的接口来依赖具体的类，而不是直接依赖某个类）
    依赖倒置原则的核心思想是，要依赖于抽象，不要依赖于具体。
    比如说，有一个类叫做电脑，这个电脑有一个方法叫做work，这个方法需要一个鼠标对象，如果我们在这个方法中直接new一个鼠标对象，那么这个电脑就依赖于鼠标这个具体的类了。
    如果我们把这个鼠标抽象成一个接口，然后让具体的鼠标类实现这个接口，那么这个电脑就依赖于鼠标这个抽象的接口了，这样的话，就可以让这个电脑使用任何实现了鼠标接口的类了。
### 0.5 接口隔离原则（简单来说：使用多个专门的接口，而不是使用单一的总接口）
    接口隔离原则的核心思想是，使用多个专门的接口，而不是使用单一的总接口，也就是说，一个类对另一个类的依赖应该建立在最小的接口上。
    举个例子，假设有一个接口IAnimal，里面有eat() 和 fly()，现在Bird和Fish类都继承了这个接口，但是，Fish 并不需要实现 fly() 方法，因为鱼是不能飞行的。
    这时候，就可以使用接口隔离原则，将 Animal 接口拆分成两个接口：IEatable 和 IFlyable，分别包含 eat() 和 fly() 方法，让这两个类分别实现，提高了代码的可维护性和灵活性。 
### 0.6 迪米特法则（简单来说：用别的类要通过别的类所属的Service操作，不要直接碰别的类）
    迪米特法则的核心思想是，一个对象应该对其他对象保持最少的了解，也就是说，一个类应该对自己需要耦合或调用的类知道的最少，类的内部如何实现与调用者或者依赖者没关系，调用者或者依赖者只需要知道它需要的方法即可。
    举个例子，假设有一个学校管理系统，其中包含了很多类，比如`Teacher`、`Student`、`Course` 等等。现在有一个需求，要求查询某个学生的课程信息。
    如果按照迪米特法则的原则来设计，我们应该让 `Student` 类只关心自己的信息，而不关心其他对象的信息。因此，我们可以引入一个 `CourseService` 类，专门负责查询课程信息，
    `Student` 类只需要调用 `CourseService` 类的方法即可，而不需要直接与 `Course` 类交互。这样，就降低了 `Student` 类和 `Course` 类之间的耦合度，提高了代码的灵活性和可维护性。
### 0.7 合成复用原则（简单来说：尽量使用合成/聚合的方式，而不是使用继承）
    合成复用原则的核心思想是，尽量使用合成/聚合的方式，而不是使用继承。
    可以参见组合模式或者装饰器模式。

下面是各种设计模式的简单介绍与代码链接，但是介绍的不全面，想全面还是推荐看[菜鸟教程](https://www.runoob.com/design-pattern/design-pattern-intro.html)，程序例子看自己的这个还不错，好理解
## 一、创建型模式
对象实例化的模式，创建型模式用于解耦对象的实例化过程。
### 1.1 [单例模式](src/main/java/org/bradaier/designpatterns/creational/singleton/DCL.java)
    最简单的就是饿汉，直接初始化一个静态变量，每次有人调用getInstance()方法时，直接返回这个静态变量即可。
    但是这样的话，就会在类加载的时候就创建这个实例，如果这个实例很大，而且不一定会被使用，那么就会造成内存的浪费。
    所以，我们可以使用懒汉模式，也就是在第一次使用的时候才创建这个实例，但是这样的话，就会有线程安全的问题，所以我们可以使用双重检查锁定的方式来解决这个问题。
    但是这样的话，还是会有问题，就是在JVM中，创建对象和赋值是分开的，也就是说，可能会出现先赋值，后创建对象的情况，这样的话，就会出现问题。
    所以，我们可以使用volatile关键字来解决这个问题，这样的话，就会强制线程每次都去主内存中读取变量的值，而不是从线程的私有内存中读取变量的值。
    也可以使用静态内部类的方式来实现单例模式，这样的话，就可以保证线程安全，也可以保证懒加载，而且也不会有性能问题。
    最后，还可以使用枚举的方式来实现单例模式，这样的话，就可以保证线程安全，也可以保证懒加载，而且也不会有性能问题，而且还可以防止反序列化的时候创建新的对象。

### 1.2 [工厂模式](src/main/java/org/bradaier/designpatterns/creational/factory/abstractf/IProductFactory.java)
    简单工厂模式：我有一个大工厂，里面全是if else， 你告诉我你要啥车，宝马，奥迪都能造
    工厂方法模式：我有一个工厂接口，同时有多个具体的工厂实现这个接口，宝马工厂造宝马，奥迪工厂造奥迪，这样没了if else，要啥车就用啥工厂造
    抽象工厂模式：有两个维度
               第一个维度：我抽象出了一个手机产品接口，所有品牌的手机都得实现这个接口，同时抽象了一个路由器产品接口，所有品牌的路由器都得实现这个接口
               第二个维度：我抽象出了一个厂商接口，这个接口定义了要会生产手机，也要会生产路由器
               这样的好处就是两个维度都可以扩展。

### 1.3 [建造者模式](src/main/java/org/bradaier/designpatterns/creational/builder/demo1/AbstractBuilder.java) 
    建造者模式：就是一个抽象建造者类，这个抽象建造者类可以有多个具体的建造者类，这些具体的建造者类都继承自抽象建造者类，每个具体的建造者类都可以创建一种产品类的实例。
    与工厂模式的区别在于工厂模式最终目的是创建不同的对象，比如创建手机对象和路由器对象，但建造者模式是我就要建造手机，但是有的建造者建造手机用的是高通处理器，有的建造者建造手机用的是联发科处理器，这个可以由用户来自定义，而工厂模式是由工厂来决定的。
    所以也可以简单理解为工厂生产处不同的产品，而建造者生产相同的产品，但是产品的组成不同。

### 1.4 [原型模式](src/main/java/org/bradaier/designpatterns/creational/prototype/PrototypeObject.java)
    原型模式：定义一个原形对象，这个对象需要两个步骤，一个是实现Cloneable接口，一个是重写clone()方法，这个方法的返回值是这个对象的一个浅拷贝。
    当创建新的对象实例比从头开始构建更加昂贵或复杂时，使用原型模式可以通过复制现有对象来节省时间和资源。

## 二、结构型模式
从程序的结构上实现松耦合，从而可以扩大整体的类结构，用来解决更大的问题。
### 2.1 [适配器模式](src/main/java/org/bradaier/designpatterns/structural/adapter/XiaoMiAdapter.java)
    适配器模式：适配器模式适用于需要将现有的类或接口转换为其他类或接口以满足特定需求的场景
    比如Mac只有雷电3接口，插不了USB，就需要一个适配器来转换一下，这样就可以插USB了。详细看例子中解释
    而这个适配器可以是各个牌子的, 所以可以定义一个接口来定义功能，这些适配器都实现这个接口。
    当然U盘也可以是各个牌子的，所以也可以定义一个接口来定义功能，这些U盘都实现这个接口。
    其实核心就在于某个充当适配器或充当桥的类  有一个通过构造器传入的带一定功能方法的成员变量，这个成员变量可以是接口，也可以是抽象类，也可以是具体类。桥接模式也是这个思想。

### 2.2 [桥接模式](src/main/java/org/bradaier/designpatterns/structural/bridge/AbstractComputer.java)
    桥接模式：网上都说桥接模式适用于需要将抽象部分与其实现部分分离的场景，但是我分不清楚抽象部分和实现部分是什么，所以我就自己理解了一下。我觉得很像适配器模式，
    在上边的适配器模式中，电脑想用U盘，就需要适配器，但是U盘可以有很多牌子的，所以可以定义接口来供U盘实现，桥接模式的话我理解就是适配器例子中的电脑也有很多种，
    比如Mac，小米，华为，这些电脑都可以用U盘，但是他们的接口不一样，所以就需要一个抽象类来供各种电脑实现，而桥接模式不需要像适配器模式一样真的创建一个类来当做适配器，
    这个桥是一个想象中的桥，其实核心思想是一样的，就像上边适配器模式笔记的最后一句话，这里的桥接模式就是将电脑抽象出来一个抽象类，
    这个抽象类像适配器一样有一个成员变量，这个成员变量就是U盘的抽象类，这样电脑也抽象了，可以扩展了，U盘也抽象了，也可以扩展了，而通过这个成员变量，二者联系起来了，就像有座桥一样。

### 2.3 [组合模式](src/main/java/org/bradaier/designpatterns/structural/composite/AbstractFile.java)
    组合模式：组合模式适用于需要将对象组合成树形结构以表示“部分-整体”的层次结构的场景。
    比如文件夹和文件，文件夹可以包含文件夹，也可以包含文件，文件夹和文件都是文件的一种，所以可以定义一个抽象类，这个抽象类有一个成员变量，这个成员变量是一个List，
    这个List里面可以放文件夹，也可以放文件，这样就可以实现文件夹里面可以包含文件夹，也可以包含文件了。

### 2.4 [装饰器模式](src/main/java/org/bradaier/designpatterns/structural/decorator/ColorDecorator.java)
    装饰器模式：装饰器模式适用于需要动态地为对象添加额外的职责的场景。
    其实主要的好处是可以动态的扩展和易于维护，对于网上说的避免类爆炸的情况，我觉得并不明显，比如我要给一个形状类加一个颜色功能，我通过继承的方式创建一个颜色类继承形状类就行了，
    但是用装饰器模式还需要创建一个装饰器抽象类，还需要一个具体的颜色装饰器类，这样就比继承方式的类还多了，所以这种情况并不适合使用装饰器，但是下边这个例子还可以：
    假设我们有一个简单的咖啡店程序，需要实现多种不同类型的咖啡（比如美式咖啡、拿铁咖啡、卡布奇诺等），每种咖啡可以加不同的配料（比如牛奶、糖、焦糖等）。
    如果使用继承模式来实现，可能会产生大量的子类，例如：
    美式咖啡、美式咖啡加牛奶、美式咖啡加糖、美式咖啡加焦糖、美式咖啡加牛奶和糖、美式咖啡加牛奶和焦糖、美式咖啡加糖和焦糖等等
    最可怕的是、如果还有一个新的咖啡类型，那么上述所有的子类都要重新创建一遍，
    这样就会产生很多类，代码难以维护且混乱。而如果使用装饰器模式，则可以将咖啡和配料分别抽象为两个类，然后通过不同的装饰器进行动态组合。例如：
    美式咖啡
    牛奶装饰器
    糖装饰器
    焦糖装饰器
    这样即使加咖啡种类，也可以服用这些装饰类，因为其他咖啡种类和美式咖啡都实现的同一个接口，这样可以避免类爆炸问题，
    同时也更加灵活和易于扩展。例如，如果需要添加新的咖啡或配料，只需创建对应的类和装饰器即可，不用修改原有的代码。

### 2.5 [外观模式](src/main/java/org/bradaier/designpatterns/structural/facade/ShapeFacade.java)
    外观模式：外观模式适用于需要为复杂的子系统提供一个简单的接口的场景。
    这个就很简单了，就相当于在客户端和后台服务中间加一层，比如电脑开机，需要按下电源键，然后CPU开始工作，内存开始工作，硬盘开始工作，但是我们只需要给客户端一个开机功能就行了，
    就是将复杂的子系统封装起来，对外提供一个简单的接口，这样就可以屏蔽内部的复杂性了，但是这个缺点就很明显了，不符合开闭原则，如果要增加一个功能，就需要修改外观类了。甚至如果之前的硬盘坏了，
    换了一个新的，那原来提供的那个方法也不能用了。

### 2.6 [过滤器模式](src/main/java/org/bradaier/designpatterns/structural/filter/Filter.java)
    过滤器模式：过滤器模式适用于需要根据条件从一个对象列表中筛选出一部分对象的场景。
    这个也很简单，就是把过滤器条件单抽成一个类了，建一个接口，让所有过滤规则都实现这个接口，比如我们有一个人类，这个人类有姓名、性别、年龄等属性，
    我们可以建一个过滤接口，里面有一个过滤方法，入参出参都是List<Person>，然后比如建一个过滤男性的类过滤出所有的男性，再建一个过滤女性的类过滤出所有的女性，等等，没啥意思。

### 2.7 [代理模式](src/main/java/org/bradaier/designpatterns/structural/proxy/ProxyImage.java)
    代理模式：代理模式适用于需要为其他对象提供一种代理以控制对这个对象的访问的场景。
    简单来说就是"加一层"。没啥特别的，直接看例子吧。

### 2.8 [享元模式](src/main/java/org/bradaier/designpatterns/structural/flyweight/RaceManager.java)
    享元模式：享元模式适用于需要创建大量的相似对象的场景。享是共享，元是元素，可以理解为Java对象。
    这个模式其实就是将一个对象的状态分为内部状态和外部状态，内部状态指对象共享出来的信息，存储在享元对象内部并且不会随环境改变而改变，比如我们有个网游RPG游戏，
    里面有很多种种族的角色，比如人类、兽人、精灵、矮人等，每个玩家都可以创建自己的角色，但是实际上就这么几个种族，这些种族各自的种族名称，所掌握的技能树，所属的阵营等都是一样的，
    那就可以将一个玩家创建的角色分为两部分，外部部分是玩家自己捏人的角色身高肤色等，内部不变的部分是这个种族的属性，所以我们可以将这些种族抽出来，
    定义一个工厂接口返回这些种族，然后用户创建的角色类Role里面有一个种族属性，这个属性就是从工厂里面获取的，这样就可以避免创建很多种族对象了。

## 三、行为型模式
关注对象之间的交互和职责分配问题。该模式描述了对象之间的通信方式及如何运作来完成特定任务或实现某些功能。
### 3.1 [责任链模式](src/main/java/org/bradaier/designpatterns/behavioral/chainofresponsibility/LoggerHelper.java)
    责任链模式：责任链模式适用于需要为某个请求创建一个对象链的场景。
    这个模式就是将请求和处理分开，请求者不需要关心哪个类干活，组织者把干活的人排成一队形成一个链，挨个问谁能干这个活，干不了就叫下一个来，最终遇到能干的把活干了，代码示例较好理解

### 3.2 [命令模式](src/main/java/org/bradaier/designpatterns/behavioral/command/Command.java)
    命令模式：命令模式适用于需要将请求封装成对象的场景。
    说一下遥控车这个例子。假设一个遥控车有前进、后退、左转、右转这四个动作，假设我这个车就这四个操作，那没啥说的，直接调遥控车的这四个方法就行了，没必要用命令模式，
    但是如果现在有需求，需要加个一键转圈再反转的功能，那如果不用设计模式，就需要在遥控车类里面加一个方法，然后在这个方法里面调用左转四次再调右转四次来实现，但是这样就违反了开闭原则。
    所以，对于这种情况用命令模式是好的，抽象出一个命令接口，所有命令实现这个接口，对于这个转圈的功能也可以写成一个命令类实现命令接口，然后这个类里调用左转和右转的命令类，这样就不需要懂遥控车类了。
    而且最大的好处是，可以做到一键逆转，比如遥控车先前进后左转，可以一键实现回退，这个就是命令模式的好处了。具体代码看例子吧

### 3.3 [解释器模式](src/main/java/org/bradaier/designpatterns/behavioral/interpreter/InterpretHelper.java)
    解释器模式：解释器模式适用于需要解释一些特定语法的场景。
    这个模式就是将一些特定语法的解释抽象成一个接口，然后实现这个接口，比如我们有一个计算器，可以计算加减乘除，但是我们需要计算一个表达式，比如1+2-5，
    这个时候我们就可以把数字、加号、减号分别按逻辑实现刚才抽象出来的接口，然后再写一个解释器，这个解释器就是解释用户输入的表达式，然后调用对应的接口实现类，最后输出结果
    这个模式其实用处较少，但是特定场景比如计算器这种，用这个模式最合适了。
    优点：扩展性好，灵活。
    缺点：解释器模式会引起类膨胀，每个语法都要产生一个解释器，逻辑复杂的时候，会产生大量的类，难以维护。

### 3.4 [迭代器模式](src/main/java/org/bradaier/designpatterns/behavioral/iterator/Aggregate.java)
    迭代器模式：迭代器模式适用于需要遍历集合的场景。
    迭代器经常用，比如java的集合类，都有一个iterator方法，返回一个迭代器，然后我们就可以用这个迭代器遍历集合了，
    迭代器的好处是不管你是链表还是集合还是树，都可以用xxx.getIterator获取迭代器然后遍历元素，不需要关心内部实现，而且迭代器还可以实现遍历的时候删除元素，这个是普通for循环做不到的。
    实现迭代器模式首先肯定要定义两个接口，一个是集合接口，不关什么集合，链表还是树还是啥，都实现这个接口，第二个是迭代器接口，这个接口定义了遍历集合的方法，每种集合都有各自的迭代器实现这个接口
    然后通过在集合接口内定义一个迭代器的引用变量的方式将二者关联起来，从结构上来看就像桥接模式一样。
    优点：1、它支持以不同的方式遍历一个聚合对象。 2、迭代器简化了聚合类。 3、在同一个聚合上可以有多个遍历。 4、在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。
    缺点：由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性

### 3.5 [中介者模式](src/main/java/org/bradaier/designpatterns/behavioral/mediator/NormalChatRoom.java)
    中介者模式：中介者模式适用于需要多个对象相互通信的场景。
    这个就很好理解了，这个模式就是将多个对象之间的通信抽象成一个中介者，然后每个对象都持有这个中介者的引用，然后每个对象都可以通过这个中介者来和其他对象通信，
    这样就不需要对象之间相互持有引用了，降低了耦合度，经典例子聊天室的实现，聊天室就是一个中介者，每个人都可以通过这个中介者来和其他人通信，而不需要知道其他人的信息，看代码。
    优点：1、降低了类的复杂度，将一对多转化成了一对一。 2、各个类之间的解耦。 3、符合迪米特原则。
    缺点：中介者会庞大，变得复杂难以维护。

### 3.6 [备忘录模式](src/main/java/org/bradaier/designpatterns/behavioral/memento/Originator.java)
    备忘录模式：备忘录模式适用于需要保存对象状态的场景。保存状态主要是为了恢复对象。就是回退，比如游戏存档，比如撤销操作，比如浏览器的后退按钮。
    这里按游戏存档的例子来解释，假设我们有一个游戏，游戏里面有很多关卡，每个关卡都有一个存档，我们可以在任意关卡保存游戏状态，然后在任意关卡恢复游戏状态。
    那现在就需要三个类，1、玩家类（数据会变化的类），玩家的数据随着玩家操作变化，比如当前是第几关，当前玩家的分数
                    2、存档类（备忘录），保存当前游戏是第几关，和当前玩家的分数，也就是所谓的备忘录类
                    3、存档管理类（备忘录管理类），管理类将存档类也就是备忘录保存起来用来以后恢复使用
    其实就是定义一个备忘录对象记录要保存的几个状态或属性，然后再搞一个备忘录管理类将一个个的备忘录对象保存起来，需要回复的时候拿出来把值重新set回原来的对象就行了。
    优点：1、给用户提供了一种可以恢复状态的机制。 2、存档的状态保存在了备忘录里面，而不是玩家类里面，这样玩家类就不需要关心存档的事情了，降低了耦合度。
    缺点：消耗资源。如果类的成员变量过多，势必会占用比较大的资源，而且每一次保存都会消耗一定的内存。

### 3.7 [观察者模式](src/main/java/org/bradaier/designpatterns/behavioral/observer/WeatherSubject.java)
    观察者模式：观察者模式适用于需要监听对象状态变化的场景。
    当对象间存在一对多关系时，适合使用观察者模式。比如，当一个对象被修改时，则会自动通知依赖它的对象。
    主要有两个接口，一个主题接口，也就是被观察的主题，比如天气主题，地震主题，被观察的主题实现这个接口，并在实现类里手握所有观察者的引用，当数据变化的时候
    通知所有的观察者。
    优点：1、观察者和被观察者是抽象耦合的。 2、建立一套触发机制。
    缺点：1、如果一个被观察者对象有很多直接和间接的观察者的话，将所有的观察者都通知到会花费很多时间。 2、如果在观察者和被观察者之间有循环依赖的话，观察目标会触发它们之间进行循环调用，可能导致系统崩溃。
    3、观察者模式没有相应的机制让观察者知道所观察的目标对象是怎么发生变化的，而仅仅只是知道观察目标发生了变化。

### 3.8 [状态模式](src/main/java/org/bradaier/designpatterns/behavioral/state/State.java)
    状态模式：状态模式适用于需要根据状态改变行为的场景。
    状态模式和策略模式很像，但二者的区别是：策略模式的行为是彼此独立，可相互替换的，而状态模式的行为是平行的，不可替换的，而且是相互转换的。
    状态模式就是定义一个状态接口，然后定义一堆实现类，每个实现类代表一个状态，然后在实现类里面定义这个状态下的行为，然后在实现类里面定义一个状态接口的引用变量，
    然后在实现类里面定义一个set方法，用来改变状态，然后在实现类里面定义一个执行方法，里面使用引用的状态类来执行当前状态下的行为。
    优点：1、封装了转换规则。 2、枚举可能的状态，在枚举状态之前需要确定状态种类。 3、将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新的状态，只需要改变对象状态即可改变对象的行为。
    4、允许状态转换逻辑与状态对象合成一体，而不是某一个巨大的条件语句块。 5、可以让多个环境对象共享一个状态对象，从而减少系统中对象的个数。
    缺点：1、状态模式的使用必然会增加系统类和对象的个数。 2、状态模式的结构与实现都较为复杂，如果使用不当会导致程序结构和代码的混乱。 3、状态模式对“开闭原则”的支持并不太好，对于可以切换状态的状态模式，
    增加新的状态类需要修改那些负责状态转换的源代码，否则无法切换到新增状态；而且修改某个状态类的行为也需修改对应类的源代码。

### 3.9 [策略模式](src/main/java/org/bradaier/designpatterns/behavioral/strategy/Test.java)
    策略模式：策略模式适用于需要根据传入参数改变行为的场景。
    状态模式和策略模式都属于行为型设计模式，它们在某些情况下的实现方式确实非常相似。下面是它们的相似处和区别之处：
    相似处：
    它们都封装了一系列算法或者行为，并将其抽象成接口或者抽象类，以便于替换和扩展；
    它们都通过聚合关系来引用具体的算法或者行为对象；
    它们都可以动态地切换不同的算法或者行为，并且在运行时能够透明地改变对象的行为。
    区别之处：
    策略模式主要关注的是不同的算法或者行为之间的差异性，它们可以相互替换而不影响客户端代码的调用逻辑。策略模式通过使用组合而不是继承来实现算法的复用，从而避免了多重继承带来的复杂性问题。
    状态模式主要关注的是对象内部状态的变化对其行为产生的影响，通过将状态转移的过程封装在不同的状态类中，使得系统更加灵活和可扩展。状态模式通常使用有限状态机（FSM）来描述状态的转移过程，从而简化了状态的管理和维护。
    在策略模式中，客户端通常通过一个上下文对象来使用不同的算法或者行为，而在状态模式中，客户端直接调用对象的方法，由对象自身根据当前状态来选择合适的行为。
    简而言之，策略模式主要解决的是一个对象在不同场景下采用不同的算法或者行为，从而具有了更好的拓展性和复用性；状态模式则主要解决的是根据对象内部状态的变化对其行为产生影响的问题，使得系统更加灵活和可扩展。
    优点：1、算法可以自由切换。 2、避免使用多重条件判断。 3、扩展性良好。
    缺点：1、策略类会增多。 2、所有策略类都需要对外暴露。

### 3.10 [模板模式](src/main/java/org/bradaier/designpatterns/behavioral/template/MakeCoffee.java)
    模板方法模式：模板方法模式适用于需要固定流程，但是流程中的某些步骤需要根据不同的场景来改变的场景。
    模板方法模式是一种基于继承的代码复用技术，它是一种类行为型模式，这里用冲咖啡来举例，冲咖啡的步骤是固定的，但是每种类型的咖啡可能其中的某几步略有不同，
    所以每种咖啡有自己的实现模板，都继承抽象出来的模板，看代码很容易理解
    优点：1、封装不变部分，扩展可变部分。 2、提取公共代码，便于维护。 3、行为由父类控制，子类实现。
    缺点：1、每个不同的实现都需要定义一个子类，这会导致类的个数的增加，设计更加抽象。 2、父类抽象方法由子类实现，子类执行的结果会影响父类的结果，也就是子类对父类产生影响，违背了里氏替换原则。

### 3.11 [访问者模式](src/main/java/org/bradaier/designpatterns/behavioral/visitor/Test.java)
    访问者模式：访问者模式适用于数据结构相对稳定，但是数据操作算法经常变化的场景。
    访问者模式的优点主要是扩展性好，但是写起来真麻烦，写个例子都写了2个接口8个类，举个例子：
    让我们假设有一个餐厅管理系统，包含多种不同类型的菜品，例如主食、饮料、甜点等。我们需要为这些菜品实现不同的操作，例如计算总价、获取菜品营养成分信息等。
    使用访问者模式，我们可以将不同的操作封装到不同的访问者对象中，从而实现对菜品对象的不同访问方式。除了计算总价和获取营养成分信息之外，我们还可以基于访问者模式实现其他操作，例如：
    根据用户口味推荐菜品。我们可以定义一个新的访问者类TasteVisitor，它可以根据用户指定的口味，筛选出所有符合条件的菜品。
    获取菜品评价信息。我们可以定义一个新的访问者类ReviewVisitor，它可以从外部数据源（例如互联网上的评论）中获取每个菜品的评价信息，并与菜品对象关联起来。
    这些操作都可以通过扩展访问者类来实现，且不会影响到原有的代码。这就体现了访问者模式的灵活性和可扩展性。
    但是！！！！ 有一个致命缺点，就是如果想增加一个菜品的话，那就需要在访问者接口中加一个这个菜品的visit方法，就意味着所有实现了访问者接口的类都需要修改，这就麻烦了
    优点：1、符合单一职责原则。 2、优秀的扩展性。 3、灵活性。
    缺点：1、具体元素对访问者公布细节，违反了迪米特原则。 2、具体元素变更比较困难。 3、违反了依赖倒置原则，依赖了具体类，没有依赖抽象。

