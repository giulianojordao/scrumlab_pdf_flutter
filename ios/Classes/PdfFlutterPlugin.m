#import "PdfFlutterPlugin.h"
#import "PdfView.h"

@implementation PdfFlutterPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
    PdfViewFactory* pdfViewFactory = [[PdfViewFactory alloc] initWithMessenger:registrar.messenger];
     [registrar registerViewFactory:pdfViewFactory withId:@"scrumlab_pdf_flutter_plugin"];

}
@end
