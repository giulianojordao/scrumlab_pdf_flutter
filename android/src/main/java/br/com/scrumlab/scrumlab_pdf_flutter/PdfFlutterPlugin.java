package br.com.scrumlab.scrumlab_pdf_flutter;

import io.flutter.plugin.common.PluginRegistry.Registrar;

/** PdfFlutterPlugin */
public class PdfFlutterPlugin {
  public static void registerWith(Registrar registrar) {
    registrar
            .platformViewRegistry()
            .registerViewFactory(
                    "scrumlab_pdf_flutter_plugin", new PdfFlutterFactory(registrar.messenger()));
  }
}
© 2021 GitHub, Inc.