import * as React from "react";
import jsonServerProvider from 'ra-data-json-server';
import { Admin, Resource } from 'react-admin';
import { MotorList } from './motor';
import { MotoList } from './moto';
import { MotoEdit } from './moto';
import { MotorEdit } from './motor';
import { MotorCreate } from './motor';

const dataProvider = jsonServerProvider('http://localhost:8080');
const App = () => (
    <Admin dataProvider={dataProvider}>
        <Resource name="moto" list={MotoList} edit={MotoEdit}/>
        <Resource name="motor" list={MotorList} edit={MotorEdit} create={MotorCreate}/>
    </Admin>
);

export default App;