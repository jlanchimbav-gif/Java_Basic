from enum import Enum
import reflex as rx

class FontSize(Enum):
    LOGO="conforta, sans-serif"
    TITLE="Arial, sans-serif"
    BODY="Verdana, sans-serif"
    DEFAULT="Helvetica, sans-serif"


class FontWeight(Enum):
    LIGHT="300",
    NORMAL="400",
    MEDIUM="500",
    BOLD="700"