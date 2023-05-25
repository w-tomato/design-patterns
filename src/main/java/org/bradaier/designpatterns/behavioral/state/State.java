package org.bradaier.designpatterns.behavioral.state;

/**
 * @author w-tomato
 * @description 状态模式demo 状态接口
 * @date 2023/5/25
 */
public interface State {

    // 这个接口抽象了一个遥控器的状态，有开机状态，关机状态，调高音量状态，调低音量状态
    // 具体到每个状态都需要实现这几个方法
    // 比如开机状态，开机状态下，开机按钮无效，关机按钮有效，开机状态下按了关机，就再切换到关机状态
    // 然后关机状态下， 开机按钮有效，关机按钮无效，增减音量也无效，关机状态下按了开机，就再切换到开机状态
    // 这样通过状态的自动切换，遥控器类不需要改变代码，就可以实现所有状态的操作情形
    // 这就是状态模式的精髓，将状态抽象出来，然后每个状态都实现这几个方法，这样就可以实现状态的自动切换

    // 开机按钮
    void powerOn();

    // 关机按钮
    void powerOff();

    // 增加音量
    void turnUp();

    // 减少音量
    void turnDown();

}
