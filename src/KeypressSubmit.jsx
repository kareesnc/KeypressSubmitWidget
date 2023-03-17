import { Component, createElement } from "react";

import { BadgeSample } from "./components/BadgeSample";

export class KeypressSubmit extends Component {
    constructor(props) {
        super(props);

        this.onClickHandler = this.onClick.bind(this);
    }

    render() {
        return (
            /*<BadgeSample
                type={this.props.keypresssubmitType}
                bootstrapStyle={this.props.bootstrapStyle}
                className={this.props.class}
                clickable={!!this.props.onClickAction}
                defaultValue={this.props.keypresssubmitValue ? this.props.keypresssubmitValue : ""}
                onClickAction={this.onClickHandler}
                style={this.props.style}
                value={this.props.valueAttribute ? this.props.valueAttribute.displayValue : ""}
            />*/
            undefined
        );
    }

    onClick() {
        if (this.props.onClickAction && this.props.onClickAction.canExecute) {
            this.props.onClickAction.execute();
        }
    }
}
