// LaunchModule.java
package org.jcnc.ideology;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ServiceLoader;

public class LaunchModule extends Application implements Module {
    @Override
    public void start(Stage primaryStage) {


        // 创建一个根节点
        var root = new HBox();
        ButtonModule button = new ButtonModule("开启模块", root);
        root.getChildren().addAll(button);

        // 创建场景
        Scene scene = new Scene(root, 300, 200);

        // 设置主舞台
        primaryStage.setTitle("App");
        primaryStage.setScene(scene);

        // 显示主舞台
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void moduleStart() {
        // 启动 JavaFX 应用程序
        launch();
    }

    @Override
    public void moduleStop() {
        // 在这里可以执行一些资源清理等操作
    }

    @Override
    public void moduleFind() {

    }
}
