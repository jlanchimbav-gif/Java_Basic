import reflex as rx
from enum import Enum
from jaguar_app.components.styles.colors import Colors as colors
from jaguar_app.components.styles.colors import textcolors
import jaguar_app.components.styles.font

class MaxWidth(Enum):
    MAX_WIDTH = "600px"

max_width = MaxWidth.MAX_WIDTH.value

#sizes 
class Spacer(Enum):
    ZERO="0 em"
    SMALL="0.5em"
    MEDIUM="0.75em"
    DEFAULT="1em"
    LARGE="1.5em"
    BIG = "2em"

spacer = Spacer

#BAESE STYLES

BASE_STYLES = {
    "background_color": colors.BACKGROUND.value,
    rx.button: {
        "width": "100%",
        "height": "50px",
        "display": "block",
        "align_items": "center",
        "border_radius": "5px",
        "color": textcolors.HEADER.value,
        "background_color": colors.CONTENT.value,
        "white_spaces":"normal",
        "text_align":"start",
        "hover":{
            "background_color": colors.SECONDARY.value,
            "color": textcolors.FOOTER.value
        }
    },
    rx.link: {
        "text_decoration": "none",
        "color": textcolors.HEADER.value
    }
}

title_styles=dict(
    size="6",
    width="100%",
    padding_top=Spacer.BIG.value,
    padding_bottom=Spacer.MEDIUM.value,
)


button_title_styles={
    "font_size": jaguar_app.components.styles.font.FontSize.TITLE.value,
    "font_weight": "bold",
    "color": textcolors.HEADER.value
}

button_body_styles={
    "font_size": jaguar_app.components.styles.font.FontSize.BODY.value,
    "font_weight": "bold",
    "color": textcolors.BODY.value
}

navbar_title_styles={
    "font_family": "Arial, sans-serif",
    "font_size": jaguar_app.components.styles.font.FontSize.TITLE.value,
}

STYLESHEETS = [
    "https://fonts.googleapis.com/css?family=poppins:weight@300;500;&display=swap"
               ]