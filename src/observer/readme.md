# 观察者模式

- 定义

定义对象间一种一对多的依赖关系，使得当每一个对象改变状态，则所有依赖于它的对象都会得到通知并自动更新。

- 类型

行为类模式。

- 结构
  - 被观察者：一般使用抽象类
  - 观察者：一般是一个接口，只有一个 update 方法。在被观察者状态发生改变时，触发该方法。
  - 具体的被观察者：使用这个角色是为了便于扩展，可在此角色中定义具体的业务逻辑。
  - 具体的观察者：实现观察者接口，实现被观察者状态改变时需要处理的逻辑。



- 两种模式：
  - 观察者模式又分为两种模式：push 和 pull。
  - push 是指 suject 在状态变化时将所有的状态信息都发给 observer，pull 则是 suject 通知observer 更新时，observer 获取自己感兴趣的状态。
  - 两种模式在实现上的区别：push 模式下，observer 的 update 方法接收的是状态信息；而 pull 模式下，update 方法接收的是 suject 对象，这种情况下，suject 须提供状态信息的 get 方法，让 observer 可以获取自己感兴趣的信息。
  - 两种模式的优劣：push模式要求 suject 必须了解 observer 需要的状态，pull 则是observer 按需获取；push模式下 observer 的 update 方法的参数是具体的状态信息，发生变化时必须要重写 update 方法，pull 模式则是将 suject 对象本身传给 update，是最大的参数集合。





主要参考：

http://blog.csdn.net/lansuiyun/article/details/11396815

http://blog.csdn.net/zhengzhb/article/details/7471978