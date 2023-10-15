// Main.java
package org.jcnc.ideology;

public class Main {
    public static void main(String[] args) {
        ModuleLoader moduleLoader = new ModuleLoader();

        // 创建并添加你的模块
        Module myModule = new LaunchModule();
        moduleLoader.addModule(myModule);

        // 启动所有模块
        moduleLoader.startModules();

        // 停止所有模块
        moduleLoader.stopModules();

        // 查找模块
        moduleLoader.findModules();
    }
}