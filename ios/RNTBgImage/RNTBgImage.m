//
//  RNTBgImage.m
//

//import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import <React/RCTView.h>
#import <React/UIView+React.h>
#import <React/RCTLog.h>
#import "RNTBgImage.h"

@implementation RNTBgImage
{
}

#pragma mark - UIViewHierarchy methods

- (instancetype)init
{
    if ((self = [super init])) {
    }
    return self;
}

- (void)layoutSubviews
{
    //RCTLogInfo(@"*** layoutSubviews");
    [self drawBitmap];
    [super layoutSubviews];
}

- (void)drawBitmap
{
    //RCTLogInfo(@"*** drawBitmap %@", self.drawable);
    UIImage *_repeatingImage = [UIImage imageNamed:self.drawable];
    UIColor *_repeatingBackground = [UIColor colorWithPatternImage:_repeatingImage];
    [self setBackgroundColor:_repeatingBackground];
}

@end
