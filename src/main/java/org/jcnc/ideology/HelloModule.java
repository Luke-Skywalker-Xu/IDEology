package org.jcnc.ideology;

import javafx.scene.layout.HBox;
import javafx.scene.text.Text;

/**
 * @author 许轲
 */
public class HelloModule extends Text implements Module {
    private final HBox parentNode;


    public HelloModule(String text, HBox parentNode) {
        this.parentNode = parentNode;
        setText(text);
        // 这里可以定义按钮点击时的操作
        System.out.println(text);
        parentNode.getChildren().addAll(this);
    }


    /**
     *
     */
    @Override
    public void moduleStart() {

    }

    /**
     *
     */
    @Override
    public void moduleStop() {

    }

    /**
     *
     */
    @Override
    public void moduleFind() {

    }
}
