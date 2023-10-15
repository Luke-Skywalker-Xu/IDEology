package org.jcnc.ideology;

import java.util.ArrayList;
import java.util.List;

/**
 * @author luke
 */
public class ModuleLoader {
    private final List<Module> modules = new ArrayList<>();

    // 添加一个模块到加载器
    public void addModule(Module module) {
        modules.add(module);
    }

    // 启动所有已加载的模块
    public void startModules() {
        for (Module module : modules) {
            module.moduleStart();
        }
    }

    // 停止所有已加载的模块
    public void stopModules() {
        for (Module module : modules) {
            module.moduleStop();
        }
    }

    // 在需要的时候查找模块
    public void findModules() {
        for (Module module : modules) {
            module.moduleFind();
        }
    }
}
