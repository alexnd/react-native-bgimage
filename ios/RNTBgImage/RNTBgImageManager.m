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

- (UIView *)view
{
    RNTBgImage * theView;
    theView = [[RNTBgImage alloc] init];
    return theView;
}

@end
