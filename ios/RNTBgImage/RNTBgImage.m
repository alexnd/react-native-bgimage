//
//  RNTBgImage.m
//

//import <Foundation/Foundation.h>
#import <UIKit/UIKit.h>
#import <React/RCTView.h>
#import <React/UIView+React.h>
#import <React/RCTLog.h>
#import "RNTBgImage.h"

/*
//source: https://kylewbanks.com/blog/Android-iOS-Repeating-Background-Image
  UIView *myView = [[UIView alloc] initWithFrame:CGRectMake(0, 0, 100, 100)];
  //Repeating background image
  UIImage *repeatingImage = [UIImage imageNamed:@"my_background_image"];
  UIColor *repeatingBackground = [UIColor colorWithPatternImage:repeatingImage];
  [myView setBackgroundColor:repeatingBackground];
*/

@implementation RNTBgImage
{
    //UIImage *_repeatingImage;
    //UIColor *_repeatingBackground;
}

#pragma mark - UIViewHierarchy methods

- (instancetype)init
{
    if ((self = [super init])) {
        //make initializations here...
    }
    return self;
}

- (void)layoutSubviews
{
    //RCTLogInfo(@"~~~####### layoutSubviews %@", self.drawable);
    [super layoutSubviews];
    [self drawBitmap];
}

- (void)drawBitmap
{
    //RCTLogInfo(@"~~~####### drawBitmap %@", self.drawable);
    //_repeatingImage = [UIImage imageNamed:@"wavy_line"];
    UIImage *_repeatingImage = [UIImage imageNamed:self.drawable];
    UIColor *_repeatingBackground = [UIColor colorWithPatternImage:_repeatingImage];
    [self setBackgroundColor:_repeatingBackground];
}

//- (void)setImageName:(NSString *)imageName
//{
//    self.drawable = imageName;
//    [self setNeedsDisplay];
//}

@end
