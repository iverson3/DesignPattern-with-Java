策略模式：


多用组合，少用继承

1. 组合，复用代码、更具灵活性(组合太多 可能会变得复杂、交错)
2. 继承，灵活性不够，子类可能会被迫继承一些不该有的行为
3. 抽象，具有一定的强制性，可能会出现代码重复冗余

组合(复合)：
    在类中增加一个私有域，引用另一个已有的类的实例，通过调用该引用实例的方法从而获得新的行为，这种设计被称作 组合


案例：各种鸭子产品

将鸭子的飞行行为抽象为接口，在父类中持有该接口，并由该接口代理飞行行为




总结：
        将容易变化的、有共性的各种行为 抽象为接口，有具体需求时，用相应的类具体去实现其接口
        例子中，就是将鸭子的飞行行为抽象为接口，而具体怎么飞行  则完全根据需求用相应的类去具体实现
        
        
        
        
        
策略模式：

优点：
1. 使用了组合，使架构更加灵活
2. 富有弹性，可以较好的应对变化(开放-封闭原则)
3. 更好的代码复用性(相对于继承)
4. 消除大量的条件语句

缺点：
1. 客户代码需要了解每个策略实现的细节
2. 增加了对象的数目


适用场景：
1. 许多相关的类仅仅是行为差异
2. 运行时选取不同的算法变体
3. 通过条件语句在多个分支中选取一个分支

