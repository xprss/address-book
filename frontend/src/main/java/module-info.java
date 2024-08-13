module xprsswrld.frontend {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens xprsswrld.frontend to javafx.fxml;
    exports xprsswrld.frontend;
}