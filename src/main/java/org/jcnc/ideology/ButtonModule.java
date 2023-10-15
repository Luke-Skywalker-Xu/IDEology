package org.jcnc.ideology;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ButtonModule extends Button implements Module {
    private final HBox parentHBox;


    public ButtonModule(String text, HBox parentHBox) {
        this.parentHBox = parentHBox;
        setText(text);
        setOnAction(event -> {
            // 这里可以定义按钮点击时的操作
            System.out.println("按钮被点击了！");

            var helloModule = new HelloModule("11",this.parentHBox);

            helloModule.moduleStart();


        });
    }

    /**
     *
     */
    @Override
    public void moduleStart() {
        // 这里可以添加模块启动时的逻辑
        System.out.println("模块已启动！");
        // 例如，启动后可以更改按钮文本
        setText("模块已启动");
    }

    /**
     *
     */
    @Override
    public void moduleStop() {
        // 这里可以添加模块停止时的逻辑
        System.out.println("模块已停止！");
        // 例如，停止后可以再次更改按钮文本
        setText("模块已停止");
        removeSelfFromParent();


    }

    private void removeSelfFromParent() {
        if (parentHBox != null) {
            parentHBox.getChildren().remove(this);
        }
    }

    /**
     *
     */
    @Override
    public void moduleFind() {

    }

    /**
     * @return
     */
    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }
}
