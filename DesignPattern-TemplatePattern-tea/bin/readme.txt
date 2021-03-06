模板方法模式：

定义一个业务中若干步骤的骨架，只实现其中一些确定的、固定的步骤，而将另一些不确定的步骤延迟到子类中 由子类去具体实现
Template Method使得子类可以在不改变一个业务的结构的前提下 而重定义该业务的某些特定步骤


为了让业务中的若干步骤变得更加灵活
可以使用"钩子方法"




模板方法模式的实现要素：

准备一个抽象类，将部分逻辑以具体方法的形式实现，然后声明一些抽象方法交由子类实现剩余逻辑，
用钩子方法给予子类更大的灵活性，最后将方法汇总构成一个不可改变的模板方法。


适用场景：
1. 算法或操作遵循相似的逻辑
2. 重构时，把相同的代码抽取到父类中 实现更好的代码复用
3. 重要、复杂的算法，核心算法设计为模板算法


优点：
1. 封装性好
2. 复用性好
3. 屏蔽细节
4. 便于维护

缺点：
1. 可能会存在因为继承而带来的相应问题
