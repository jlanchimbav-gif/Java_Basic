import reflex as rx
import jaguar_app.components.styles.styles as styles


def link_button(text: str, url: str = "#") -> rx.Component:
    return  rx.link(text,
                        href=url,
                        is_external=True,
                        color_scheme="blue",
                            width="100%",
                        )
def link_button_with_icon(text: str, url: str) -> rx.Component:
    return rx.button(
                        rx.hstack(
                            rx.text(text, style=styles.button_title_styles),
                            rx.icon(
                                tag="arrow_forward",
                                width=styles.Spacer.BIG.value,
                                height=styles.Spacer.DEFAULT.value,
                                margin_left=styles.Spacer.MEDIUM.value
                            ),
                            ),
                            href=url,
                            is_external=True,
                            width="100%",
                            padding_x=styles.Spacer.MEDIUM.value,
                            padding_y=styles.Spacer.SMALL.value,
                            padding_right=styles.Spacer.SMALL.value,
                    ) 