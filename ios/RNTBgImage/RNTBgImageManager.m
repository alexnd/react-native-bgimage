//
//  RNTBgImageManager.m
//

#import <React/RCTLog.h>
#import "RNTBgImageManager.h"
#import "RNTBgImage.h"

@implementation RNTBgImageManager

RCT_EXPORT_MODULE()

#pragma mark - Properties

RCT_EXPORT_VIEW_PROPERTY(drawable, NSString)

#pragma mark - Lifecycle

//- (instancetype)init
//{
//    if ((self = [super init])) {
//        self.bgImage = nil;
//    }
//    return self;
//}
//
//- (UIView *)view
//{
//    if (!self.bgImage) {
//        self.bgImage = [[RNTBgImage alloc] init];
//    }
//    return self.bgImage;
//}

- (UIView *)view
{
    RNTBgImage * theView;
    theView = [[RNTBgImage alloc] init];
    return theView;
}

@end
